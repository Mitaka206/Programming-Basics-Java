package mitaka206.Exams_o3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 12.10.2016 г..
 */
public class Euro2016Tiket {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double mymoney = Double.parseDouble(console.nextLine());
        String category = console.nextLine();
        int people = Integer.parseInt(console.nextLine());
        if (mymoney<=1000000 && mymoney>=1000) {
            if (category.equals("Normal")) {
                double normal = 249.99;

                if (people >= 1 && people <= 4) {
                    double transport = mymoney * 0.25;
                    double total = (transport) - (normal * people);
                    if (transport > (normal * people)) {
                        System.out.printf("Yes! You have %.2f leva left.", total);
                    } else {
                        double of = Math.abs(total);
                        System.out.printf("Not enough money! You need %.2f leva.", of);
                    }
                } else if (people >= 5 && people <= 9) {
                    double transport = mymoney * 0.4;
                    double total = (transport) - (normal * people);
                    if (transport > (normal * people)) {
                        System.out.printf("Yes! You have %.2f leva left.", total);
                    } else {
                        double of = Math.abs(total);
                        System.out.printf("Not enough money! You need %.2f leva.", of);
                    }
                } else if (people >= 10 && people <= 24) {
                    double transport = mymoney * 0.5;
                    double total = (transport) - (normal * people);
                    if (transport > (normal * people)) {
                        System.out.printf("Yes! You have %.2f leva left.", total);
                    } else {
                        double of = Math.abs(total);
                        System.out.printf("Not enough money! You need %.2f leva.", of);
                    }
                } else if (people >= 25 && people <= 49) {
                    double transport = mymoney * 0.6;
                    double total = (transport) - (normal * people);
                    if (transport > (normal * people)) {
                        System.out.printf("Yes! You have %.2f leva left.", total);
                    } else {
                        double of = Math.abs(total);
                        System.out.printf("Not enough money! You need %.2f leva.", of);
                    }
                } else if (people >= 50 && people <= 200) {
                    double transport = mymoney * 0.75;
                    double total = (transport) - (normal * people);
                    if (transport > (normal * people)) {
                        System.out.printf("Yes! You have %.2f leva left.", total);
                    } else {
                        double of = Math.abs(total);
                        System.out.printf("Not enough money! You need %.2f leva.", of);
                    }
                }

            }
            if (category.equals("VIP")) {
                double normal = 499.99;

                if (people >= 1 && people <= 4) {
                    double transport = mymoney * 0.25;
                    double total = (transport) - (normal * people);
                    if (transport > (normal * people)) {
                        System.out.printf("Yes! You have %.2f leva left.", total);
                    } else {
                        double of = Math.abs(total);
                        System.out.printf("Not enough money! You need %.2f leva.", of);
                    }
                } else if (people >= 5 && people <= 9) {
                    double transport = mymoney * 0.4;
                    double total = (transport) - (normal * people);
                    if (transport > (normal * people)) {
                        System.out.printf("Yes! You have %.2f leva left.", total);
                    } else {
                        double of = Math.abs(total);
                        System.out.printf("Not enough money! You need %.2f leva.", of);
                    }
                } else if (people >= 10 && people <= 24) {
                    double transport = mymoney * 0.5;
                    double total = (transport) - (normal * people);
                    if (transport > (normal * people)) {
                        System.out.printf("Yes! You have %.2f leva left.", total);
                    } else {
                        double of = Math.abs(total);
                        System.out.printf("Not enough money! You need %.2f leva.", of);
                    }
                } else if (people >= 25 && people <= 49) {
                    double transport = mymoney * 0.6;
                    double total = (transport) - (normal * people);
                    if (transport > (normal * people)) {
                        System.out.printf("Yes! You have %.2f leva left.", total);
                    } else {
                        double of = Math.abs(total);
                        System.out.printf("Not enough money! You need %.2f leva.", of);
                    }
                } else if (people >= 50 && people <= 200) {
                    double transport = mymoney * 0.75;
                    double total = (transport) - (normal * people);
                    if (transport > (normal * people)) {
                        System.out.printf("Yes! You have %.2f leva left.", total);
                    } else {
                        double of = Math.abs(total);
                        System.out.printf("Not enough money! You need %.2f leva.", of);
                    }
                }

            }
        }
    }
}
