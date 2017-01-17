package Loops_homework;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 21.10.2016 г..
 */
public class MaxNum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int max = -100000;

        for (int i=0; i<n; i++){
            int nums = Integer.parseInt(console.nextLine());
            if (nums>max){
                max=nums;
            }
        }
        System.out.println(max);
    }
}
