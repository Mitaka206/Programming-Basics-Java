package mitaka206.IntroProgramming;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 15.11.2016 г..
 */
public class sumNum {
    //Да се напише if-конструкция, която изчислява стойността на две целочислени променливи и разменя техните стойности, ако стойността на първата променлива е по-голяма от втората.
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = Double.parseDouble(console.nextLine());
        double b = Double.parseDouble(console.nextLine());
        if (a != b) {
            System.out.println(Math.max(a, b));
        }

    }
}
