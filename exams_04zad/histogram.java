package exaps_04zad;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 25.10.2016 г..
 */
public class histogram {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        String s= "%";

        for (int i = 0; i < n; i++) {
            double num = Double.parseDouble(console.nextLine());

            if (num < 200) {
                p1++; //колко числа има??? нужно ми е обяснение.
            } else if(num >= 200 && num <= 399) {
                p2++;
            } else if(num >= 400 && num <= 599) {
                p3++;
            } else if(num >= 600 && num <= 799) {
                p4++;
            } else if(num >= 800) {
                p5++;
            }
        }
        System.out.printf("%.2f%s%n", p1/n*100, s);
        System.out.printf("%.2f%s%n", p2/n*100, s);
        System.out.printf("%.2f%s%n", p3/n*100, s);
        System.out.printf("%.2f%s%n", p4/n*100, s);
        System.out.printf("%.2f%s%n", p5/n*100, s);

    }
}
