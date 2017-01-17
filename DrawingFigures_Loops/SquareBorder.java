package DrawingFigures_Loops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 24.10.2016 г..
 */
public class SquareBorder {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        System.out.print("+ ");
        for (int i = 0; i < n - 2; i++) {
            System.out.print("- ");
        }
        System.out.println("+");


        for (int j = 0; j < n - 2; j++) {
            System.out.print("| ");
            for (int i = 0; i < n - 2; i++) {
                System.out.print("- ");
            }
            System.out.println("|");
        }


        System.out.print("+ ");
        for (int i = 0; i < n - 2; i++) {
            System.out.print("- ");
        }
        System.out.println("+");

    }
}
