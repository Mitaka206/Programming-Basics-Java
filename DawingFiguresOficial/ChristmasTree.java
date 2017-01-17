package DawingFiguresOficial;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 2.11.2016 г..
 */
public class ChristmasTree {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int space = n-1;
        int star = 1;

        System.out.println(repeadStr(" ", space+1) + " | ");

        for (int i = 0; i < n; i++) {
            System.out.println(repeadStr(" ", space) + repeadStr("*", star) + " | " + repeadStr("*", star));
            space--;
            star++;
        }

    }

    static String repeadStr(String str, int count) {
        StringBuilder repeated = new StringBuilder();

        for (int i = 0; i < count; i++) {
            repeated.append(str);

        }
        return repeated.toString();
    }
}
