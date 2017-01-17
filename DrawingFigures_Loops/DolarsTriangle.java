package DrawingFigures_Loops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 24.10.2016 г..
 */
public class DolarsTriangle {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("$");
            for (int j = 0; j < i; j++) {
                System.out.print(" $");
            }
            System.out.println();
        }

    }
}
