package mitaka206.examp3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 8.10.2016 г..
 */
public class PassG {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String guest= console.nextLine();
        String pass = "s3cr3t!P@ssw0rd";

        if (guest.equals(pass)){
            System.out.println("Welcome");
        }else {
            System.out.println("Wrong password!");
        }

    }
}
