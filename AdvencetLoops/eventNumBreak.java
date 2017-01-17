package mitaka206.AdvencetLoops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 6.11.2016 г..
 */
public class eventNumBreak {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = 0;
        while (true){
            try {
            System.out.print("Enter even number: ");
            n = Integer.parseInt(console.nextLine());
            if (n%2==0){
                break;
            }
            System.out.println("The number is not even.");
            }catch (NumberFormatException ex){
                System.out.println("Invalid number.");
            }
        }
        System.out.println("Even number entered: " + n);
    }
}
