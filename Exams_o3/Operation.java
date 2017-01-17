package mitaka206.Exams_o3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 12.10.2016 г..
 */
public class Operation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n1 = Integer.parseInt(console.nextLine());
        int n2 = Integer.parseInt(console.nextLine());
        String symbol = console.nextLine();

        if (symbol.equals("+") || symbol.equals("-") || symbol.equals("*")) {
            if (symbol.equals("+")) {
                int ok = n1 + n2;
                if (ok % 2 == 0) {
                    System.out.printf("%d + %d = %d - even", n1, n2, ok);
                } else {
                    System.out.printf("%d + %d = %d - odd", n1, n2, ok);
                }
            } else if (symbol.equals("-")) {
                int ok = n1 - n2;
                if (ok % 2 == 0) {
                    System.out.printf("%d - %d = %d - even", n1, n2, ok);
                } else {
                    System.out.printf("%d - %d = %d - odd", n1, n2, ok);
                }
            }
            if (symbol.equals("*")) {
                int ok = n1 * n2;
                if (ok % 2 == 0) {
                    System.out.printf("%d * %d = %d - even", n1, n2, ok);
                } else {
                    System.out.printf("%d * %d = %d - odd", n1, n2, ok);
                }
            }
        }else
        if (symbol.equals("/")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                double N1 = n1;
                double N2 = n2;
                double ok = N1 / N2;
                System.out.printf("%.0f / %.0f = %.2f", N1, N2, ok);
            }
        }else
        if (symbol.equals("%")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                String persent = "%";
                double N1 = n1;
                double N2 = n2;
                double ok = N1 % N2;
                System.out.printf("%.0f %s %.0f = %.0f",N1 , persent, N2, ok);
            }
        }
    }
}