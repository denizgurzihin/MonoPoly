import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Monopoly {

    public static void main(String[] args) {
        System.out.println("WELCOME TO MONOPOLY GAME");
        int totalPlayer = 0;
        Scanner scanner = new Scanner(System.in);
        while (totalPlayer < 2 || totalPlayer > 8) {
            try {
                System.out.println("How many people are playing? (2 - 8)");
                totalPlayer = scanner.nextInt();
            } catch (Exception e) {
                System.err.println("Error: Number too large.");
            }
            if (totalPlayer > 8 || totalPlayer < 2) {
                System.err.println("Error: Invalid player count.");
            }
        }

        ChanceDeck chanceDeck = new ChanceDeck("Chance");
        CommunityChestDeck communityChestDeck = new CommunityChestDeck("Community Chest");
        Board board = new Board(communityChestDeck, chanceDeck);
        ArrayList<Player> players = new ArrayList<>(totalPlayer);
        Die[] dice = new Die[2];
        for (int i = 0; i < 2; i++)
            dice[i] = new Die();
        for (int i = 0; i < totalPlayer; i++) {
            System.out.print("Please enter a player name : ");
            Player newPlayer = new Player(scanner.next(), dice, board);
            players.add(newPlayer);
        }

        ArrayList<Player> currentPlayers = (ArrayList<Player>) players.clone();


        //set locations of MoveToSquareCard, MoveAndCollectMoneyCard and GoToJailCard
        //communityChestDeck
        ((GoToJailCard)communityChestDeck.getCommunityChestDeck().get(4)).setLocation(board.getSquare(10));
        ((MoveAndCollectMoneyCard)communityChestDeck.getCommunityChestDeck().get(0)).setLocation(board.getSquare(0));
        //chanceDeck
        ((GoToJailCard)chanceDeck.getChanceDeck().get(8)).setLocation(board.getSquare(10));
        ((MoveAndCollectMoneyCard)chanceDeck.getChanceDeck().get(0)).setLocation(board.getSquare(0));
        ((MoveAndCollectMoneyCard)chanceDeck.getChanceDeck().get(3)).setLocation(board.getSquare(5));
        ((MoveToSquareCard)chanceDeck.getChanceDeck().get(1)).setLocation(board.getSquare(24));
        ((MoveToSquareCard)chanceDeck.getChanceDeck().get(4)).setLocation(board.getSquare(11));
        ((MoveToSquareCard)chanceDeck.getChanceDeck().get(13)).setLocation(board.getSquare(39));

        //shuffle Decks
        chanceDeck.shuffle();
        communityChestDeck.shuffle();

        //play rounds
        int roundCounter = 0;
        while(currentPlayers.size() >= 2){
            System.out.println(" \n");
            System.out.println("ROUND: " + (roundCounter++));
            for(int j=0; j<currentPlayers.size() && currentPlayers.get(j).getActivityStatus(); j++) {
                currentPlayers.get(j).playTurn();
                currentPlayers.removeIf(p -> p.getActivityStatus() == false);
            }
        }

        currentPlayers.forEach(p -> System.out.print("\n********** WINNER IS : " + p.getName() + "!!! **********"));
    }
}

