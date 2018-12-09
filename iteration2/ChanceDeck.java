import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ChanceDeck implements DeckInterface {
    private String name;
    private Card topCard;
    private List<Card> chanceDeck;

    public ChanceDeck(String name) {
        this.name=name;
        this.chanceDeck = new ArrayList<>(DeckInterface.SIZE);

        //build deck
        Card card1 = new MoveAndCollectMoneyCard("Advance to Go.",200);
        this.chanceDeck.add(card1);
        Card card2 = new MoveToSquareCard("Advance to Illinois Ave.");
        this.chanceDeck.add(card2);
        Card card3 = new GoToNearestUtilityCard("Advance token to nearest Utility.");
        this.chanceDeck.add(card3);
        Card card4 = new MoveAndCollectMoneyCard("Take a trip to Reading Railroad.",200);
        this.chanceDeck.add(card4);
        Card card5 = new MoveToSquareCard("Advance to St. Charles Place.");
        this.chanceDeck.add(card5);
        Card card6 = new CollectMoneyCard("Bank pays you dividend of $50.",50);
        this.chanceDeck.add(card6);
        //implement later
        Card card7 = new GetOutOfJailCard("Get out of Jail free.");
        this.chanceDeck.add(card7);
        Card card8 = new GoBackCard("Go back 3 spaces.");
        this.chanceDeck.add(card8);
        Card card9 = new GoToJailCard("Go directly to Jail – do not pass Go, do not collect $200.");
        this.chanceDeck.add(card9);
        Card card10 = new RegularCard("Make general repairs on all your property – for each house pay $25 – for each hotel $100.");
        this.chanceDeck.add(card10);
        Card card11 = new PayMoneyCard("Pay poor tax of $15.",15);
        this.chanceDeck.add(card11);
        Card card12 = new GoToNearestRailRoadCard("Take a trip to Reading Railroad.");
        this.chanceDeck.add(card12);
        Card card13 = new GoToNearestRailRoadCard("Take a trip to Reading Railroad.");
        this.chanceDeck.add(card13);
        Card card14 = new MoveToSquareCard("Take a walk on the Boardwalk.");
        this.chanceDeck.add(card14);
        //implement later
        Card card15 = new PayMoneyCard("You have been elected chairman of the board – pay each player $50.",50);
        this.chanceDeck.add(card15);
        Card card16 = new CollectMoneyCard("Your building loan matures – collect $150.",150);
        this.chanceDeck.add(card16);
        Card card17 = new CollectMoneyCard("You have won a crossword competition - collect $100.",100);
        this.chanceDeck.add(card17);
    }

    public void drawCard(){
        //draw card and set it to topCard
        this.topCard=this.chanceDeck.get(DeckInterface.SIZE-1);
        //send it bottom
        Card tempCard=this.chanceDeck.get(DeckInterface.SIZE-1);
        for(int i=0; i<DeckInterface.SIZE-1; i++){
            this.chanceDeck.set(DeckInterface.SIZE-1-i,this.chanceDeck.get(DeckInterface.SIZE-2-i));
        }
        this.chanceDeck.set(0,tempCard);
    }

    public void shuffle(){
        //shuffle deck
        Random rand = new Random();
        //Generate two random numbers between 0 to DeckInterface.SIZE
        for(int i = 0 ; i < 10 ; i ++){
            int firstCard = rand.nextInt(DeckInterface.SIZE);
            int secondCard = rand.nextInt(DeckInterface.SIZE);
            Collections.swap(this.chanceDeck,firstCard,secondCard);
        }
    }

    public String getName() {
        return name;
    }

    public Card getTopCard() {
        return topCard;
    }

    public List<Card> getChanceDeck() {
        return chanceDeck;
    }
}
