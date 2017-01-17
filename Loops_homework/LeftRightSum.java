package Loops_homework;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 21.10.2016 г..
 */
public class LeftRightSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            int nums1 = Integer.parseInt(console.nextLine());
            sum1 = sum1 + nums1;
        }
        for (int j = 0; j < n; j++) {
            int nums2 = Integer.parseInt(console.nextLine());
            sum2 = sum2 + nums2;
        }
        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d", sum1);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sum1 - sum2));
        }
    }
}
