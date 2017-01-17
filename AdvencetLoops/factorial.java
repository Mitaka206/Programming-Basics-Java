package mitaka206.AdvencetLoops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 6.11.2016 г..
 */
public class factorial {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int num = 1;

        do {   // не разбирам това
            num = num * n;
            n--;
        } while (n > 1);

        System.out.println(num);

    }
}
