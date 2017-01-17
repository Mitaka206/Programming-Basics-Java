package mitaka206.Loops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 15.11.2016 г..
 */
public class LeftRightSum {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++) {
           int leftnum = Integer.parseInt(console.nextLine());
            leftSum+=leftnum;
        }

        for (int i = 0; i < n; i++) {
            int rightnum = Integer.parseInt(console.nextLine());
            rightSum+=rightnum;
        }

        if (leftSum==rightSum){
            System.out.printf("Yes, sum = %d", leftSum);
        }else {
            System.out.printf("No, diff = %d", Math.abs(leftSum-rightSum));
        }

    }
}
