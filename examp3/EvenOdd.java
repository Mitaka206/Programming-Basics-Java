package mitaka206.examp3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 6.10.2016 г..
 */
public class EvenOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        if (a % 2 == 0)
        {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
