package mitaka206.AdvencetLoops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 6.11.2016 г..
 */
public class EventPowersOf2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int num = 1;
        System.out.println(num);
        for (int i = 1; i <= n-1; i+=2) {
            num*=4;
            System.out.println(num);
        }

    }
}
