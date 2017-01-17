package mitaka206.AdvencetLoops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 6.11.2016 г..
 */
public class probaWhile {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = 10;//Integer.parseInt(console.nextLine());

        while (n>0){ //изпълнява докато е вярно (+ един път)
            n--;
            System.out.println(n);
        } // _9 8 7 6 5 4 3 2 1 0

    }
}
