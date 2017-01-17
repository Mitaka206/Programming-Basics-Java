package mitaka206.examp2;


import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner concole = new Scanner(System.in);
        double C = concole.nextDouble();
        double F = C*1.8+32;
        System.out.printf("F: %.2f", F);
    }
}
