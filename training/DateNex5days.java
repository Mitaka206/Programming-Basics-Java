package Podgotovka;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Mitaka206 on 26.10.2016 г..
 */
public class DateNex5days {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int day = Integer.parseInt(console.nextLine());
        int mon = Integer.parseInt(console.nextLine());

        int nextDay = 0;
        int nextMon = 0;

        if (mon == 2) {
            nextDay = (day + 5) % 28;
            nextMon = mon + (day + 5) / 28;
        } else if (mon == 4 || mon == 6 || mon == 9 || mon == 11) {
            nextDay = (day + 5) % 30;
            nextMon = mon + (day + 5) / 30;
        } else {
            nextDay = (day + 5) % 31;
            nextMon = mon + (day + 5) / 31;
        }

        if (nextMon > 12) {
            nextMon -= 12;
            System.out.printf("%d.%02d", nextDay, nextMon);

        } else {
            System.out.printf("%d.%02d", nextDay, nextMon);
        }
    }
}
