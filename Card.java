public abstract class Card {
    private String explanation;

    public Card(String explanation){
        this.explanation = explanation;
    }

    public String getExplanation() {
        return explanation;
    }

    public abstract void action(Player player);
}
