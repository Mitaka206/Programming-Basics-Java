package mitaka206.examp2;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 23.9.2016 г..
 */
public class Rectangle2D {
    public static void main(String[] args) {
        Scanner R2D = new Scanner(System.in);
        double x1 = R2D.nextDouble();
        double y1 = R2D.nextDouble();
        double x2 = R2D.nextDouble();
        double y2 = R2D.nextDouble();
        double a = x1-x2;
        double b = y2-y1;
        double area = Math.abs(a)*Math.abs(b);
        double per = 2*Math.abs(a)+2*Math.abs(b);
        System.out.println("Area="+area);
        System.out.println("Perimeter="+per);
    }
}
