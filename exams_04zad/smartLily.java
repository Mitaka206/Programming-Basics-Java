package exaps_04zad;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 26.10.2016 г..
 */
public class smartLily {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int age = Integer.parseInt(console.nextLine());
        double cenaPeralnq = Double.parseDouble(console.nextLine());
        double cenaIgrachka = Double.parseDouble(console.nextLine());

        double money = 0;
        double toy = 0;
        double bonus = 10;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money += bonus;
                money -= 1;
                bonus += 10;
            } else {
                toy++;
            }
        }
        double allmoney = money + toy * cenaIgrachka;

        if (allmoney>cenaPeralnq){
            System.out.printf("Yes! %.2f%n", allmoney-cenaPeralnq);
        }else {
            System.out.printf("No! %.2f", cenaPeralnq-allmoney);
        }
    }
}
