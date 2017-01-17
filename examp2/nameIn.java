package mitaka206.examp2;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 22.9.2016 г..
 */
public class nameIn {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("First name: ");
        String name1 = console.nextLine();
        System.out.print("Family name: ");
        String name2 = console.nextLine();
        System.out.println("Hello " + name1 + " " + name2 + "!" );


    }
}
