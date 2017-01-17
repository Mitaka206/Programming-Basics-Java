package DawingFiguresOficial;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 2.11.2016 г..
 */
public class Romb {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int space = n - 1;
        int star = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(repeadStr(" ", space) + repeadStr("* ", star));

            space--;
            star++;
        }

        space = 1;
        star = n - 1;

        for (int i = 0; i < n - 1; i++) {
            System.out.println(repeadStr(" ", space) + repeadStr("* ", star));

            space++;
            star--;
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
