package mitaka206.examp4;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 14.10.2016 г..
 */
public class FrutShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String frut = console.nextLine();
        String day = console.nextLine();
        //String fr = "banana", "apple", "orange","grapefruit", "kiwi", "pineapple", "grapes";
        double sum = Double.parseDouble(console.nextLine());
        if (frut.equals("banana") || frut.equals("grapes") || frut.equals("kiwi") || frut.equals("pineapple") || frut.equals("apple") || frut.equals("orange") || frut.equals("grapefruit")) {
            if (day.equals("Sunday") || day.equals("Saturday")) {

                if (frut.equals("banana")) {
                    double ex = 2.7 * sum;
                    System.out.printf("%.2f", ex);
                } else if (frut.equals("apple")) {
                    double ex = 1.25 * sum;
                    System.out.printf("%.2f", ex);
                } else if (frut.equals("orange")) {
                    double ex = 0.9 * sum;
                    System.out.printf("%.2f", ex);
                } else if (frut.equals("grapefruit")) {
                    double ex = 1.6 * sum;
                    System.out.printf("%.2f", ex);
                } else if (frut.equals("kiwi")) {
                    double ex = 3.0 * sum;
                    System.out.printf("%.2f", ex);
                } else if (frut.equals("pineapple")) {
                    double ex = 5.6 * sum;
                    System.out.printf("%.2f", ex);
                } else if (frut.equals("grapes")) {
                    double ex = 4.2 * sum;
                    System.out.printf("%.2f", ex);
                }

            } else if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {

                if (frut.equals("banana")) {
                    double ex = 2.5 * sum;
                    System.out.printf("%.2f", ex);
                } else if (frut.equals("apple")) {
                    double ex = 1.20 * sum;
                    System.out.printf("%.2f", ex);
                } else if (frut.equals("orange")) {
                    double ex = 0.85 * sum;
                    System.out.printf("%.2f", ex);
                } else if (frut.equals("grapefruit")) {
                    double ex = 1.45 * sum;
                    System.out.printf("%.2f", ex);
                } else if (frut.equals("kiwi")) {
                    double ex = 2.7 * sum;
                    System.out.printf("%.2f", ex);
                } else if (frut.equals("pineapple")) {
                    double ex = 5.5 * sum;
                    System.out.printf("%.2f", ex);
                } else if (frut.equals("grapes")) {
                    double ex = 3.85 * sum;
                    System.out.printf("%.2f", ex);
                }

            }
        } else {
            System.out.println("error");
        }

    }
}
