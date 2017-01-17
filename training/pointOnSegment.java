package Podgotovka;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 26.10.2016 г..
 */
public class pointOnSegment {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int first = Integer.parseInt(console.nextLine());
        int second = Integer.parseInt(console.nextLine());
        int point = Integer.parseInt(console.nextLine());

        if (point<=first && point>=second){
            System.out.println("in");
        }else {
            System.out.println("out");
        }

        if (Math.abs(first-point)>Math.abs(second-point)){
            System.out.println (Math.abs(second-point));
        }else {
            System.out.println(Math.abs(first-point));
        }

    }
}
