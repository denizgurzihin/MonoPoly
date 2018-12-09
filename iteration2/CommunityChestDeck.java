import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CommunityChestDeck implements DeckInterface {
    private String name;
    private Card topCard;
    private List<Card> communityChestDeck;

    public CommunityChestDeck(String name) {
        this.name=name;
        this.communityChestDeck = new ArrayList<>(DeckInterface.SIZE);

        //build deck
        Card card1 = new MoveAndCollectMoneyCard("Advance to Go.",200);
        this.communityChestDeck.add(card1);
        Card card2 = new CollectMoneyCard("Bank error in your favor – collect $75.",75);
        this.communityChestDeck.add(card2);
        Card card3 = new PayMoneyCard("Doctor's fees – Pay $50.",50);
        this.communityChestDeck.add(card3);
        Card card4 = new GetOutOfJailCard("Get out of Jail free.");
        this.communityChestDeck.add(card4);
        Card card5 = new GoToJailCard("Go directly to Jail – do not pass Go, do not collect $200.");
        this.communityChestDeck.add(card5);
        //implement later
        Card card6 = new CollectMoneyCard("It is your birthday Collect $10 from each player.",10);
        this.communityChestDeck.add(card6);
        //implement later
        Card card7 = new CollectMoneyCard("Grand Opera Night – collect $50 from every player for opening night seats.",50);
        this.communityChestDeck.add(card7);
        Card card8 = new CollectMoneyCard("Income Tax refund – collect $20.",20);
        this.communityChestDeck.add(card8);
        Card card9 = new CollectMoneyCard("Life Insurance Matures – collect $100.",100);
        this.communityChestDeck.add(card9);
        Card card10 = new PayMoneyCard("Pay Hospital Fees of $100.",100);
        this.communityChestDeck.add(card10);
        Card card11 = new PayMoneyCard("Pay School Fees of $50.",50);
        this.communityChestDeck.add(card11);
        Card card12 = new CollectMoneyCard("Receive $25 Consultancy Fee.",25);
        this.communityChestDeck.add(card12);
        Card card13 = new RegularCard("You are assessed for street repairs – $40 per house, $115 per hotel.");
        this.communityChestDeck.add(card13);
        Card card14 = new CollectMoneyCard("You have won second prize in a beauty contest– collect $10.",10);
        this.communityChestDeck.add(card14);
        Card card15 = new CollectMoneyCard("You inherit $100.",100);
        this.communityChestDeck.add(card15);
        Card card16 = new CollectMoneyCard("From sale of stock you get $50.",50);
        this.communityChestDeck.add(card16);
        Card card17 = new CollectMoneyCard("Holiday Fund matures - Receive $100.",100);
        this.communityChestDeck.add(card17);

    }

    public void drawCard(){
        //draw card and set it to topCard
        this.topCard=this.communityChestDeck.get(DeckInterface.SIZE-1);
        //send it bottom
        Card tempCard=this.communityChestDeck.get(DeckInterface.SIZE-1);
        for(int i=0; i<DeckInterface.SIZE-1; i++){
            this.communityChestDeck.set(DeckInterface.SIZE-1-i,this.communityChestDeck.get(DeckInterface.SIZE-2-i));
        }
        this.communityChestDeck.set(0,tempCard);
    }

    public void shuffle(){
        //shuffle deck
        Random rand = new Random();
        //Generate two random numbers between 0 to DeckInterface.SIZE
        for(int i = 0 ; i < 10 ; i ++){
            int firstCard = rand.nextInt(DeckInterface.SIZE);
            int secondCard = rand.nextInt(DeckInterface.SIZE);
            Collections.swap(this.communityChestDeck,firstCard,secondCard);
        }
    }

    public String getName() {
        return name;
    }

    public Card getTopCard() {
        return topCard;
    }

    public List<Card> getCommunityChestDeck() {
        return communityChestDeck;
    }
}
