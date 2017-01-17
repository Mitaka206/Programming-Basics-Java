package mitaka206.IntroProgramming;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 15.11.2016 г..
 */
public class Bonus {
 //   Напишете програма, която прилага бонус точки към дадени точки в интервала [1..9] чрез прилагане на следните правила:
           // -     Ако точките са между 1 и 3, програмата ги умножава по 10.
           // -     Ако точките са между 4 и 6, ги умножава по 100.
            //-     Ако точките са между 7 и 9, ги умножава по 1000.
           // -     Ако точките са 0 или повече от 9, се отпечатва съобщение за грешка.

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int point = Integer.parseInt(console.nextLine());

        int bonus1 = 10;
        int bonus2 = 100;
        int bonus3 = 1000;

        if (point<=0 || point>9){
            System.out.println("Error");
        }else if (point>=1 && point<=3){
            System.out.println(point*bonus1);
        }else if (point>=4 && point<=6){
            System.out.println(point*bonus2);
        }else if (point>=7 && point<=9){
            System.out.println(point*bonus3);
        }


    }
}
