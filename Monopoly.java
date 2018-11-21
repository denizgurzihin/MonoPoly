import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Monopoly {
    private static final int TOTAL_ROUNDS = 10;

//gygbytby
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
            if(totalPlayer > 8) {
                System.err.println("Error: Invalid player count.");
            }
        }


        List<Player> players = new ArrayList<>(totalPlayer);
        for(int i=0; i<totalPlayer;i++){
            System.out.print("Please enter a player name : ");
            Player newPlayer = new Player(scanner.next(), dice, board);
            players.add(newPlayer);
        }

        for (int i=0; i<TOTAL_ROUNDS; i++){
            System.out.println(" ");
            System.out.println("ROUND: " + (i+1));
            for(int j=0; j<totalPlayer;j++)
                players.get(j).playTurn();
        }

    }


}
