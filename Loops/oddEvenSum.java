package mitaka206.Loops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 15.11.2016 г..
 */
public class oddEvenSum {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(console.nextLine());
            if (i%2==0){
                evenSum+=num;
            }else {
                oddSum+=num;
            }
        }
        if (evenSum==oddSum){
            System.out.printf("Yes%nSum = %d",evenSum);
        }else {
            System.out.printf("No%nDiff = %d",Math.abs(evenSum-oddSum));
        }

    }
}
