package Podgotovka;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 26.10.2016 г..
 */
public class PointInFigure {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int xp = Integer.parseInt(console.nextLine());
        int yp = Integer.parseInt(console.nextLine());
        int h = 1;
        int x1, x2, x3, x4, y1, y2, y3, y4;
        x1 = h;
        y1 = h;
        x2 = h*4;
        y2 = h*3;
        boolean fig1 = xp >= x1 && xp <= x2;

    }
}
