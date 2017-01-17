package mitaka206.Loops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 15.11.2016 г..
 */
public class allAtoZ {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        for (int i = 'a'; i <= 'z'; i++) {
            System.out.printf("%c%n", i);
        }

        //for (char a='a'; a<='z'; a++){
        //    System.out.println(a);
        //}

    }
}
