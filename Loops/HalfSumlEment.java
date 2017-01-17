package mitaka206.Loops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 15.11.2016 г..
 */
public class HalfSumlEment {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int maxNum = -1000000000;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(console.nextLine());
            if (num>maxNum){
                maxNum=num;
            }
            sum+=num;
        }
        int sum1 = sum-maxNum;
        if (sum1==maxNum){
            System.out.printf("Yes%nSum = %d", maxNum);
        }else {
            System.out.printf("No%nDiff = %d", Math.abs(sum1-maxNum));
        }

    }
}
