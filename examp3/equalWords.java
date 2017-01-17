package mitaka206.examp3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 8.10.2016 г..
 */
public class equalWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String w1 = console.nextLine().toLowerCase();
        String w2 = console.nextLine().toLowerCase();

        if (w1.equals(w2)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
