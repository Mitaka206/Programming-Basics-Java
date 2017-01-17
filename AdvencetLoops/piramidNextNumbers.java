package mitaka206.AdvencetLoops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 6.11.2016 г..
 */
public class piramidNextNumbers {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a= Integer.parseInt(console.nextLine());
        int b= Integer.parseInt(console.nextLine());

        if (a!=b){
            System.out.println(a+b);
        }else {
            System.out.println(2*(a+b));
        }

        //if (a>b || a+b>10){
        //    System.out.println(true);
        //}else {
        //    System.out.println(false);
        //}

    }
}
