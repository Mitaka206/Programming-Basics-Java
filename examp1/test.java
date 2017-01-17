package mitaka206.examp1;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 17.9.2016 г..
 */
public class Proba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height, base, area;
        System.out.println("Area of triangle");
        System.out.print("height: ");
        height = input.nextDouble();
        System.out.print("Base: ");
        base = input.nextDouble();
        area = height * base/2;
        System.out.println("Area: " + area);

    }
}
