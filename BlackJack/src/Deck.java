import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Tom on 9/1/2015.
 */
public class Deck {

    private ArrayList<Card> deck= new ArrayList<>();

    public ArrayList<Card> getDeck()
    {
        return deck;
    }

    public ArrayList<Card> createAndShuffleDeck()
    {
        for(int i = 2; i<10; i++)
        {

            Card s = new Card(i, Suit.SPADES);
            deck.add(s);
        }
        for(int i=0; i<5;i++)
        {
            Card s = new Card(10, Suit.SPADES);
            deck.add(s);
        }
        for(int i = 2; i<10; i++)
        {

            Card s = new Card(i, Suit.DIAMONDS);
            deck.add(s);
        }
        for(int i=0; i<5;i++)
        {
            Card s = new Card(10, Suit.DIAMONDS);
            deck.add(s);
        }
        for(int i = 2; i<10; i++)
        {

            Card s = new Card(i, Suit.HEARTS);
            deck.add(s);
        }
        for(int i=0; i<5;i++)
        {
            Card s = new Card(10, Suit.HEARTS);
            deck.add(s);
        }
        for(int i = 2; i<10; i++)
        {

            Card s = new Card(i, Suit.CLUBS);
            deck.add(s);
        }
        for(int i=0; i<5;i++)
        {
            Card s = new Card(10, Suit.CLUBS);
            deck.add(s);
        }

        Collections.shuffle(deck);

        return null;
    }
}
