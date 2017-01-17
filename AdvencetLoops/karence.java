package mitaka206.AdvencetLoops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 18.11.2016 г..
 */
public class karence {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = i + j + 1;

                if (num > n) {
                    num = 2 * n - num;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }


    }
}
