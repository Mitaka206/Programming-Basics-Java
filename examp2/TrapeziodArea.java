package mitaka206.examp2;


import java.util.Scanner;

public class TrapeziodArea {
    public static void main(String[] args) {
        Scanner TrapArea = new Scanner (System.in);
        double b1 = TrapArea.nextDouble();
        double b2 = TrapArea.nextDouble();
        double h = TrapArea.nextDouble();
        double Area = (b1+b2)*h/2;
        System.out.println("Area= " + Area);

    }
}
