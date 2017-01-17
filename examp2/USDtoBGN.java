package mitaka206.examp2;


import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner concole = new Scanner(System.in);
        double usd = concole.nextDouble();
        double bgn = usd*1.79549;
        System.out.printf("%.2f BGN", bgn);
    }
}
