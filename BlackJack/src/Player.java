import java.util.ArrayList;

/**
 * Created by Tom on 9/1/2015.
 */
public class Player {


    private ArrayList<Card> playerCards = new ArrayList<>();

    private int score = 0;

    public void Hit(Card a)
    {
        playerCards.add(a);
    }

    public void Hit2(Card a, Card b)
    {
        playerCards.add(a);
        playerCards.add(b);
    }

    public int Score() {
        score=0;
        for (Card s : playerCards)
        {
            score = score + s.getValue();
        }
        return score;
    }

}
