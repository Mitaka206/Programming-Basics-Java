package exaps_04zad;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 25.10.2016 г..
 */
public class division {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        String s = "%";

        for (int i = 0; i < n; i++) {
            double num = Double.parseDouble(console.nextLine());

            if (num%2==0){
                p1++;
            }
            if (num%3==0){
                p2++;
            }
            if (num%4==0){
                p3++;
            }

        }
        System.out.printf("%.2f%s%n", p1/n*100, s);
        System.out.printf("%.2f%s%n", p2/n*100, s);
        System.out.printf("%.2f%s%n", p3/n*100, s);

    }
}
