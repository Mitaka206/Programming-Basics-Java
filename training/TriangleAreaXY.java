package Podgotovka;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Mitaka206 on 26.10.2016 г..
 */
public class TriangleAreaXY {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());
        double x3 = Double.parseDouble(console.nextLine());
        double y3 = Double.parseDouble(console.nextLine());

        double a = Math.abs(x3-x2);
        double h = Math.abs(y2-y1);

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.printf(df.format(a*h/2));

    }
}
