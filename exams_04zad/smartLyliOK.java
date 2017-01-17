package exaps_04zad;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 25.10.2016 г..
 */
public class smartLyliOK {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double age = Double.parseDouble(console.nextLine());
        //double peralnq = Double.parseDouble(console.nextLine());
        //double presentPrice = Double.parseDouble(console.nextLine());

        double spesteni = 0;
        double moneToy = 0;

        double bonus = 10;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                spesteni += bonus;
                spesteni -= 1;
                bonus += 10;
            } else {
             //   moneToy += presentPrice;
            }
        }
        double allMoney = spesteni + moneToy;
        System.out.println(spesteni);

       // if (allMoney >= peralnq) {
       //     System.out.printf("Yes! %.2f%n", allMoney - peralnq);
       // } else {
       //     System.out.printf("No! %.2f%n", peralnq - allMoney);
       // }
    }
}
