package DrawingFigures_Loops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 25.10.2016 г..
 */
public class Diamond {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = 5;

        //String dash = "-";

        if (n % 2 != 0) {

            for (int row = 0; row < (n + 1) / 2; row++) {
                for (int col = 1; col < (n + 1) / 2 - row; col++) {
                    System.out.print("-");
                }
                System.out.print("*");
                System.out.println();


            }
        }
    }
}

