package mitaka206.examp2;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner Name = new Scanner(System.in);
        //System.out.print("Enter your name:");
        String name = Name.nextLine();
        System.out.printf("Hello, %s!" , name);
    }
}
