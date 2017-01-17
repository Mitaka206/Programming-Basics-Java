package mitaka206.examp1;

import java.util.Scanner;

public class triangle55star {
    public static void main(String[] args) {
        Scanner star = new Scanner(System.in);
        int br = star.nextInt();
        for (int c = 1 ; c <= br ; c++)
        {
            for (int d = 1 ; d <= c ; d++)
            {
                System.out.print ("*");
            }
            System.out.println("");
        }

    }
}
