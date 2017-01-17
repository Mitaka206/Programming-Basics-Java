package mitaka206.examp3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 8.10.2016 г..
 */
public class EqualNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num1 = Double.parseDouble(console.nextLine());
        double num2 = Double.parseDouble(console.nextLine());
        double num3 = Double.parseDouble(console.nextLine());

        if (num1==num2 && num2==num3 && num1==num3){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
