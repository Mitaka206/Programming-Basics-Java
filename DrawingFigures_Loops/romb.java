package DrawingFigures_Loops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 24.10.2016 г..
 */
public class romb {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());;

        for (int row = 0; row < n; row++) {
            for (int col = 1; col < n - row; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int col = 0; col < row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int row = 0; row < n-1; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int col = 2; col < n-row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
