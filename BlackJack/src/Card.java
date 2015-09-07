/**
 * Created by Tom on 8/31/2015.
 */
public class Card {
    private int value;
    private Suit suit;

    public Card(int value, Suit suit)
    {
        this.value = value;
        this.suit = suit;
    }
    public int getValue()
    {
        return value;
    }
}
