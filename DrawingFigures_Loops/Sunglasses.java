package DrawingFigures_Loops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 25.10.2016 г..
 */
public class Sunglasses {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int row = 0; row < n * 2; row++) {
            System.out.print("*");
        }


        for (int row = 0; row < n; row++) {
            System.out.print(" ");
        }


        for (int row = 0; row < n * 2; row++) {
            System.out.print("*");
        }
        System.out.println();


        for (int row = 1; row <= n - 2; row++) { //как ще се сетим за това
            System.out.print("*");
            for (int col = 0; col < n * 2 - 2; col++) {
                System.out.print("/");
            }
            System.out.print("*");


            if (row == (n-1)/2) { //как ще се сетим за това
                for (int col = 0; col < n; col++) {
                    System.out.print("|");
                }
            } else {
                for (int col = 0; col < n; col++) {
                    System.out.print(" ");
                }
            }


            System.out.print("*");
            for (int col = 0; col < n * 2 - 2; col++) {
                System.out.print("/");
            }
            System.out.println("*");
        }


        for (int row = 0; row < n * 2; row++) {
            System.out.print("*");
        }


        for (int row = 0; row < n; row++) {
            System.out.print(" ");
        }


        for (int row = 0; row < n * 2; row++) {
            System.out.print("*");
        }
    }
}
