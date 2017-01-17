package mitaka206.Loops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 15.11.2016 г..
 */
public class MaxNum {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int max = -1000000000;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(console.nextLine());
            if (num>max){
                max=num;
            }
        }
        System.out.println(max);
    }
}
