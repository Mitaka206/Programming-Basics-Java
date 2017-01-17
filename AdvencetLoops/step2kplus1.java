package mitaka206.AdvencetLoops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 6.11.2016 г..
 */
public class step2kplus1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int k = 1;

        while (k <= n) { //докато "k" е вярно да се изпълнява условието
            System.out.println(k);
            k = 2 * k + 1;
        }
    }
}
