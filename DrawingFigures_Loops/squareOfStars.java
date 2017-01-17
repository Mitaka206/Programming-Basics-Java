package DrawingFigures_Loops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 24.10.2016 г..
 */
public class squareOfStars {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int j = 1; j < n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
