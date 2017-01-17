package DrawingFigures_Loops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 25.10.2016 г..
 */
public class ChristmasThree {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());;
        for (int rol = 0; rol < n + 1; rol++) {
            for (int col = 0; col < n - rol; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < rol; col++) {
                System.out.print("*");
            }
            System.out.print(" | ");

            for (int col = 0; col < rol; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
