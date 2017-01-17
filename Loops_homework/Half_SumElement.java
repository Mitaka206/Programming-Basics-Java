package Loops_homework;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 21.10.2016 г..
 */
public class Half_SumElement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double n = Double.parseDouble(console.nextLine());

        double max = 0;
        double sum = 0;

        for (int i=0; i<n; i++){
            double num = Double.parseDouble(console.nextLine());
            sum=sum+num;
            if (num>max) {
                max = num;
            }
        }
        if (max==(sum/2)){  // ако е int дава грешка при 11/2
            System.out.println("Yes");
            System.out.printf("Sum = %.0f", max);
        }else {
            System.out.println("No");
            System.out.printf("Diff = %.0f", Math.abs(max-(sum-max)));
        }

    }
}
