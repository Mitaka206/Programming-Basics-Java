package mitaka206.IntroProgramming;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 15.11.2016 г..
 */
public class MaxOF5nums {
//  Напишете програма, която намира най-голямото по стойност число измежду дадени 5 числа.
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a1 = Integer.parseInt(console.nextLine());
        int a2 = Integer.parseInt(console.nextLine());
        int a3 = Integer.parseInt(console.nextLine());
        int a4 = Integer.parseInt(console.nextLine());
        int a5 = Integer.parseInt(console.nextLine());

        int d1 = Math.max(a1,a2);
        int d2 = Math.max(a1,a3);

        int d3 = Math.max(a1,a4);
        int d4 = Math.max(a1,a5);

        int dd = Math.max(d1,d4);
        int de = Math.max(d2,d3);

        System.out.println(Math.max(dd,de));


    }
}
