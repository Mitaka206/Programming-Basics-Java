package mitaka206.examp3;

import java.util.Scanner;

/**
 * Created by Mitko on 6.10.2016 г..
 */
public class GreaterNum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1 = Integer.parseInt(console.nextLine());
        int num2 = Integer.parseInt(console.nextLine());

        if (num1<num2)
        {
            System.out.println(num2);
        }
        else
        {
            System.out.println(num1);
        }
    }
}
