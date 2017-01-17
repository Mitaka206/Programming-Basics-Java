package DrawingFigures_Loops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 24.10.2016 г..
 */
public class rectangleNxNstars {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
