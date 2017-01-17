package mitaka206.AdvencetLoops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 18.11.2016 г..
 */
public class Digits {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int num1 = n / 100;
        int num2 = n / 10 % 10;
        int num3 = n % 10;

        int row = num1 + num2;
        int col = num1 + num3;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (n % 5 == 0) {
                    n -= num1;
                }else
                if (n % 3 == 0) {
                    n -= num2;
                } else {
                    n += num3;
                }
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }
}
