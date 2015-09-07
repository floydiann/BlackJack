/**
 * Created by Tom on 8/30/2015.
 */
public class Dice {
    private int sides;
    private int result;

    public Dice(int s) {
        sides = s;
    }

    public int rollDice() {
        result = (int) (Math.random() * (sides - 1)) + 1;
        return result;
    }


}
