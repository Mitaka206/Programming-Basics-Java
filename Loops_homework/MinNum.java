package Loops_homework;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 21.10.2016 г..
 */
public class MinNum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int min = 1000000;

        for (int i=0;i<n;i++){
            int num = Integer.parseInt(console.nextLine());
            if (num<min){
                min=num;
            }
        }
        System.out.println(min);
    }
}
