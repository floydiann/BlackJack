import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;


public class Game {

    public static void Score(int p, int d)
    {

        if (p>21){
            System.out.println("Your score is " + p + " and dealers is " + d + ", you lose.");
        }else if (d>21) {
            System.out.println("Your score is " + p + " and the dealers is " + d + ", you win.");
        }else if(p==21)
        {
            System.out.println("Your score is" + p + "and the dealers is " + d + ", you win.");
        }else if(d==21)
        {
            System.out.println("Your score is" + p + "and the dealers is " + d + ", you lose.");
        }else
        {
            System.out.println("Your score is " + p + " and dealers is " + d + ". h/s");
        }

    }


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to play some blackjack? y/n");
        String a = scan.nextLine();
        if(a.equals("y"))
        {
            Dealer d1 = new Dealer();
            Player p1 = new Player();
            Deck da = new Deck();
            da.createAndShuffleDeck();

            ArrayList<Card> d = da.getDeck();
            ListIterator<Card> listIterator = d.listIterator();

            d1.Hit2(listIterator.next(), listIterator.next());
            p1.Hit2(listIterator.next(), listIterator.next());

            Score(p1.Score(), d1.Score());
            a = scan.nextLine();
            while(a.equals("h")){
                p1.Hit(listIterator.next());
                Score(p1.Score(), d1.Score());
                a = scan.nextLine();
            }
            if(a.equals("s"))
            {
                while(d1.Score()<17)
                {
                    d1.Hit(listIterator.next());
                }
                int pp = 21-p1.Score();
                int dd = 21-d1.Score();
                if(pp>dd)
                {
                    System.out.println("Your score is "+p1.Score()+" and the dealers is "+d1.Score()+", you lose.");
                }else if(dd<pp)
                    System.out.println("Your score is "+p1.Score()+" and the dealers is "+d1.Score()+", you win.");
                else if(pp==dd)
                    System.out.println("Tie.");
            }




        }
    }
}