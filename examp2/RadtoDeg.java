package mitaka206.examp2;


import java.util.Scanner;

public class RadtoDeg {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double rad = console.nextDouble();
        double deg = rad*180/Math.PI;
        System.out.printf("%.0f" , deg);

    }
}
