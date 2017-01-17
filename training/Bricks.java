package Podgotovka;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 26.10.2016 г..
 */
public class Bricks {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double bricks = Double.parseDouble(console.nextLine());
        double man = Double.parseDouble(console.nextLine());
        double bricksONcar = Double.parseDouble(console.nextLine());

        double onCourse = man*bricksONcar;
        double course = Math.round(bricks/onCourse);
    if (course>=1) {
        System.out.printf("%.0f", course);
    }else {
        System.out.println(1);
    }
    }
}
