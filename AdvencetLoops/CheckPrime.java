package mitaka206.AdvencetLoops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 6.11.2016 г..
 */
public class CheckPrime {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        boolean prime = true;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
