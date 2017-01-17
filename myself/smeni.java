package mitaka206.a01samostoqt;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 14.11.2016 г..
 */
public class smeni {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //int dayofWek = 30; //Integer.parseInt(console.nextLine());

        int mont = 30;


        for (int i = 1; i <= mont; i++) {
            if (i % 6 == 0) {
                System.out.println(i + ". urok   |");
            } else if ((i == 3 || i == 4 || i == 7 || i == 8 || i == 11 || i == 12 || i == 15 || i == 16 || i == 19 || i == 20 || i == 22 || i == 23 || i == 26 || i == 27 || i == 30) && i % 6 != 0) {
                System.out.println(i + ". rabota |");
            } else {
                System.out.println(i + ".        |");
            }
        }


    }


}

