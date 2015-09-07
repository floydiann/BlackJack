import java.util.ArrayList;

/**
 * Created by Tom on 9/2/2015.
 */
public class Dealer {

    ArrayList<Card> dealerCards = new ArrayList<>();

    private int score=0;

    public void Hit2(Card a, Card b)
    {
        dealerCards.add(a);
        dealerCards.add(b);
    }

    public void Hit(Card a)
    {
        dealerCards.add(a);
    }

    public int Score()
    {
        score = 0;
        for(Card s : dealerCards)
        {
            score = score + s.getValue();
        }
        return score;
    }
}
