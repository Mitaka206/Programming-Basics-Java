package mitaka206.Loops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 15.11.2016 г..
 */
public class equalPairs {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int sum = 0;

        int max = -99999999;
        int min = 99999999;


        for (int i = 0; i < n; i++) {
            int num1 = Integer.parseInt(console.nextLine());
            int num2 = Integer.parseInt(console.nextLine());
            sum = num1+num2;
            if (sum>max){
                max=sum;
            }
            if (sum<min){
                min=sum;
            }
        }
        if (max==min){
            System.out.println ("Yes, value=" + max);
        }else{
            int diff = max-min;
            System.out.println ("No, maxdiff=" + diff);
        }
    }
}
