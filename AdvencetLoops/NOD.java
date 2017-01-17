package mitaka206.AdvencetLoops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 6.11.2016 г..
 */
public class NOD {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());

        while (b != 0) { // не разбирам това
            int oldB = b;
            b = a % b;
            a = oldB;
        }
        System.out.println(a);

    }
}
