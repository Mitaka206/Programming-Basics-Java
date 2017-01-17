package mitaka206.examp2;

import java.util.Scanner;

public class CircleA_P {
    public static void main(String[] args) {
        Scanner CPA = new Scanner(System.in);
        double r = CPA.nextDouble();
        double pi = Math.PI;
        double Area =pi*r*r;
        double Per = 2*pi*r;
        System.out.println("C Area=" + Area);
        System.out.println("C Perimeter=" + Per);
    }
}
