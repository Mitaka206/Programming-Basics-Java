package DawingFiguresOficial;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 2.11.2016 г..
 */
public class butterFly {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i < n - 2; i++) {
            if (i % 2 == 0) {
                System.out.println(repeadStr("*", n - 2) + "\\ /" + repeadStr("*", n - 2));
            } else{
                System.out.println(repeadStr("-", n - 2) + "\\ /" + repeadStr("-", n - 2));
            }
        }

        System.out.println(repeadStr(" ",n-1) + "@" + repeadStr(" ",n-1));

        for (int i = 0; i < n - 2; i++) {
            if (i % 2 == 0) {
                System.out.println(repeadStr("*", n - 2) + "/ \\" + repeadStr("*", n - 2));
            } else{
                System.out.println(repeadStr("-", n - 2) + "/ \\" + repeadStr("-", n - 2));
            }
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
