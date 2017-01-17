package mitaka206.examp2;

import java.util.Scanner;

public class InchToSm {
    public static void main(String[] args) {
        System.out.println("Inch to Santimeters?");
        Scanner inch = new Scanner(System.in);
        System.out.print("Inch: ");
        double Inch = inch.nextDouble();
        double SM = Inch*2.54;
        System.out.println("Santimeters= " + SM);
    }
}
