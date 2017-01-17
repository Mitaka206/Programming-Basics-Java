package mitaka206.AdvencetLoops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 6.11.2016 г..
 */
public class NumsInRange1to100 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Еnter a number in the range [1...100]: ");
        int n = Integer.parseInt(console.nextLine());


        while (n<1 || n>100){ // ако "n" е извън 1-100, да се повтаря условието
            System.out.println("Invalid number!");
            System.out.print("Еnter a number in the range [1...100]: ");
            n = Integer.parseInt(console.nextLine());
        }
        System.out.println("The number is: " + n);
    }
}
