package mitaka206.IntroProgramming;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 15.11.2016 г..
 */
public class MaxOf3nums {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        int c = Integer.parseInt(console.nextLine());

        int d = Math.max(a,b);
        int d1 = Math.max(a,c);

        System.out.println(Math.max(d, d1));

    }
}
