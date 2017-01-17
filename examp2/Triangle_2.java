package mitaka206.examp2;

import java.util.Scanner;

public class Triangle_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        double h = console.nextDouble();
        double Area = a*h/2;
        System.out.printf("Area=  %.2f" , Area);
    }
}
