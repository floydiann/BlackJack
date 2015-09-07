import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi, it's coin flipper, press 'p' for flipping.");
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
        String input = scanner.next();
        if(input.equals("p")) {
            if (Math.random() < 0.5) {
                System.out.println("It's heads. Play again?");
            } else
                System.out.println("It's tails. Play again?");
        }
        else
            System.exit(0);
        }


    }
}
