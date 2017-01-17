package mitaka206.examp3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 8.10.2016 г..
 */
public class AreaFigures {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String figure = console.nextLine();
        String square, rectangle, circle, triangle;

        if (figure.equals("square")){
            double a = Double.parseDouble(console.nextLine());
            double area = a*a;
            System.out.printf("%.3f", area);
        }else if (figure.equals("rectangle")){
            double a = Double.parseDouble(console.nextLine());
            double b = Double.parseDouble(console.nextLine());
            double area = a*b;
            System.out.printf("%.3f", area);
        }else if (figure.equals("circle")){
            double r = Double.parseDouble(console.nextLine());
            double area = Math.PI*r*r;
            System.out.printf("%.3f", area);
        }else if (figure.equals("triangle")){
            double a = Double.parseDouble(console.nextLine());
            double h = Double.parseDouble(console.nextLine());
            double area = a*h/2;
            System.out.printf("%.3f", area);
        }
    }
}
