package Loops_homework;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 21.10.2016 г..
 */
public class SumNum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(console.nextLine());
            sum = sum + num;
        }
        System.out.println(sum);


    }
}
