package mitaka206.IntroProgramming;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 15.11.2016 г..
 */
public class HowSumNumOf0 {
//Дадени са няколко цели числа. Напишете програма, която намира онези подмножества от тях, които имат сума 0. Примери:
//       -     Ако са дадени числата {-2, -1, 1}, сумата на -1 и 1 е 0.
//       -     Ако са дадени числата {3, 1, -7}, няма подмножества със сума 0.
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        int c = Integer.parseInt(console.nextLine());

        if ((a+b)==0 || (a+c)==0 || (b+c)==0){
            System.out.println("има нулев сбор");
        }else {
            System.out.println("няма нула");
        }

    }
}
