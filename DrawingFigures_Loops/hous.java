package DrawingFigures_Loops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 25.10.2016 г..
 */
public class hous {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        if (n % 2 != 0) {

            for (int row = 0; row < (n + 1) / 2; row++) {
                for (int col = 1; col < (n + 1) / 2 - row; col++) {
                    System.out.print("-");
                }
                System.out.print("*");
                for (int col = 0; col < row; col++) {
                    System.out.print("*" + "*");
                }
                for (int col = 1; col < (n + 1) / 2 - row; col++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        } else {
            for (int row = 0; row < (n + 1) / 2; row++) {
                for (int col = 1; col < (n + 1) / 2 - row; col++) {
                    System.out.print("-");
                }
                System.out.print("**");
                for (int col = 0; col < row; col++) {
                    System.out.print("*" + "*");
                }
                for (int col = 1; col < (n + 1) / 2 - row; col++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }
        for (int row = 0; row < n / 2; row++) {
            System.out.print("|");

            for (int col = 0; col < n - 2; col++) {
                System.out.print("*");
            }

            System.out.print("|");

            System.out.println();
        }

    }
}

