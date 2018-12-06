public abstract class Card {
    private String name;
    private String explanation;

    public Card(String name, String explanation){
        this.name = name;
        this.explanation = explanation;
    }

    public abstract void action(Player player);
}
