package mitaka206.AdvencetLoops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 18.11.2016 г..
 */
public class StopNum {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int end = Integer.parseInt(console.nextLine());
        int start = Integer.parseInt(console.nextLine());
        int stop = Integer.parseInt(console.nextLine());

        for (int i = start; i >= end; i--) {
            if (i % 2 == 0 && i % 3 == 0) {
                if (i == stop) {
                    break;
                } else {
                    System.out.print(i + " ");
                }
            }

        }

    }
}
