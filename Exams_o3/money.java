package mitaka206.Exams_o3;

import java.util.Scanner;


public class money {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        int btc = money.nextInt();
        double chain = money.nextDouble();
        double comision = money.nextDouble();

        int btcBG = 1168*btc;
        double chainUS = 0.15;
        double usBG = 1.76;
        double euBG = 1.95;
        double op = chain*chainUS*1.76;

        double exit = ((op+btcBG)/euBG)*(1-comision/100);
        System.out.println(exit);
    }
}
