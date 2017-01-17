package mitaka206.IntroProgramming;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 15.11.2016 г..
 */
public class QataroUrawnenie {
    //Напишете програма, която при въвеждане на коефициентите (a, b и c) на квадратно уравнение: clip_image005, изчислява и извежда неговите реални корени.
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //Ако квадратният тричлен f(x) = a x2 + b x + c
        // където х1, х2 са корените на уравнението f(x) = 0.
        double a = Double.parseDouble(console.nextLine());
        double b = Double.parseDouble(console.nextLine());
        double c = Double.parseDouble(console.nextLine());

        double x1 = 0;
        double x2 = 0;

        if (a != 0) {

            double D = b * b - 4 * a * c;
            x1 = (-b+Math.sqrt(D))/(2*a);
            x2 = (-b-Math.sqrt(D))/(2*a);
        }
        System.out.println(x1);
        System.out.println(x2);
    }
}
