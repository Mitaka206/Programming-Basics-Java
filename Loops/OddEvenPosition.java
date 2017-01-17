package mitaka206.Loops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Mitaka206 on 15.11.2016 г..
 */
public class OddEvenPosition {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        double evenMax = -999999999;
        double evenMin = 999999999;
        double oddMax = -999999999;
        double oddMin = 999999999;

        double evenSum = 0;
        double oddSum = 0;

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(console.nextLine());
            if (i % 2 == 0) {
                evenSum += num;
                if (num > evenMax) {
                    evenMax = num;
                }
                if (num < evenMin) {
                    evenMin = num;
                }
            } else {
                oddSum += num;
                if (num > oddMax) {
                    oddMax = num;
                }
                if (num < oddMin) {
                    oddMin = num;
                }
            }
        }
        DecimalFormat df = new DecimalFormat("#.##");// за дабъл числа !!1,5!! а НЕ 1,500

        System.out.println("OddSum=" + df.format(oddSum));
        if (n==0) {
            System.out.println("OddMin=" + "No,");
            System.out.println("OddMax=" + "No,");

        } else {
            System.out.println("OddMin=" + df.format(oddMin));
            System.out.println("OddMax=" + df.format(oddMax));
        }

        System.out.println("EvenSum=" + df.format(evenSum));

        if (n==0 || n == 1){
            System.out.println("EvenMin=" + "No,");
            System.out.println("EvenMax=" + "No");
        }else {
            System.out.println("EvenMin=" + df.format(evenMin));
            System.out.println("EvenMax=" + df.format(evenMax));
        }
    }
}
