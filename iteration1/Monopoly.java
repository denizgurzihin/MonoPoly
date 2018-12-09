import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Monopoly {

    public static void main(String[] args) {
        Board board = new Board();
        Die[] dice = new Die[2];
        for(int i=0; i<2; i++)
            dice[i] = new Die();


        System.out.println("WELCOME TO MONOPOLY GAME");
        int totalPlayer = 0;
        Scanner scanner = new Scanner(System.in);
        while (totalPlayer < 2 || totalPlayer > 8) {
            try {
                System.out.println("How many people are playing? (2 - 8)");
                totalPlayer = scanner.nextInt();
            }
            catch(Exception e) {
                System.err.println("Error: Number too large.");
                continue;
            }
            if(totalPlayer > 8 || totalPlayer< 2) {
                System.err.println("Error: Invalid player count.");
            }
        }


        ArrayList<Player> players = new ArrayList<>(totalPlayer);
        for(int i=0; i<totalPlayer;i++){
            System.out.print("Please enter a player name : ");
            Player newPlayer = new Player(scanner.next(), dice, board);
            players.add(newPlayer);
        }



        ArrayList<Player> currentPlayers = (ArrayList<Player>) players.clone();
        int roundCounter=0;
        while(currentPlayers.size() >= 2){
            System.out.println(" \n");
            System.out.println("ROUND: " + (roundCounter++));
            for(int j=0; j<currentPlayers.size() && currentPlayers.get(j).getStatus(); j++) {
                currentPlayers.get(j).playTurn();
                currentPlayers.removeIf(p -> p.getStatus() == false);
            }
        }

        currentPlayers.forEach(p -> System.out.print("\n********** WINNER IS : " + p.getName() + "!!! **********"));
    }


}
