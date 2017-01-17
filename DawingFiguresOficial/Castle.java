package DawingFiguresOficial;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 2.11.2016 г..
 */
public class Castle {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        System.out.print("/" + repeadStr("^", n / 2) + "\\");
        if (n > 4) {
            System.out.print(repeadStr("_", n / 2));
        }
        System.out.println("/" + repeadStr("^", n / 2) + "\\");



        for (int i = 0; i < n - 3; i++) {
            System.out.print("|" + repeadStr(" ", n / 2) + " ");
            if (n > 4) {
                System.out.print(repeadStr(" ", n / 2));
            }
            System.out.println(" " + repeadStr(" ", n / 2) + "|");
        }




        System.out.print("|" + repeadStr(" ", n / 2) + " ");
        if (n > 4) {
            System.out.print(repeadStr("_", n / 2));
        }
        System.out.println(" " + repeadStr(" ", n / 2) + "|");


        System.out.print("\\" + repeadStr("_", n / 2) + "/");
        if (n > 4) {
            System.out.print(repeadStr(" ", n / 2));
        }
        System.out.print("\\" + repeadStr("_", n / 2) + "/");
    }

    static String repeadStr(String str, int count) {
        StringBuilder repeated = new StringBuilder();

        for (int i = 0; i < count; i++) {
            repeated.append(str);

        }
        return repeated.toString();
    }
}
