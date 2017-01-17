package mitaka206.examp4;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 14.10.2016 г..
 */
public class InvalidNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        //if (num>=100 && num<=200 || num==0){

        //} else {
        //    System.out.println("invalid");
        //}
        boolean ex = (num >= 100 && num <= 200) || num == 0;
        if (!ex)
            System.out.println("invalid");
    }
}
