package mitaka206.IntroProgramming;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 15.11.2016 г..
 */
public class PLUSmINUS {
//Напишете програма, която показва знака (+ или -) от частното на две реални числа, без да го пресмята.
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = Double.parseDouble(console.nextLine());
        double b = Double.parseDouble(console.nextLine());

        if (a-b<0){
            System.out.println("-");
        }else {
            System.out.println("+");
        }


    }
}
