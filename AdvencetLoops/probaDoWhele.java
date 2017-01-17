package mitaka206.AdvencetLoops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 6.11.2016 г..
 */
public class probaDoWhele {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = 10;//Integer.parseInt(console.nextLine());

        do { // изпълнявасе ... (поне веднъж, преди да се провери условието)
            n--;
            System.out.println(n); //ще отпечата всички стъпки
        } while (n > 0); // ...докато е вярна проверката (+ още един път)
        // _9 8 7 6 5 4 3 2 1 0


        System.out.println("последна цифра " + n); //ще отпечата само последна цифра
    }
}
