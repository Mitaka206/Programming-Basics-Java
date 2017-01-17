package DawingFiguresOficial;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 3.11.2016 г..
 */
public class perfectDiamond {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int dot = n;
        int star = 1;
        int mid = 0;

        System.out.println(repeadStr(".", dot) + "*" + repeadStr("*", (3 * n) - 1) + repeadStr(".", dot));

        for (int i = 0; i < n - 1; i++) {
            System.out.println(repeadStr(".", dot - 1) + "*" + repeadStr(".", 3 * n + mid) + "*" + repeadStr(".", dot - 1));
            dot--;
            mid += 2;
        }
        System.out.println(repeadStr("*", 5 * n));

        dot = 1;
        mid = 2*n-4;

        for (int i = 0; i < 2 * n; i++) {
            System.out.println(repeadStr(".", dot) + "*" + repeadStr(".", 3 * n + mid) + "*" + repeadStr(".", dot));
            dot++;
            mid -= 2;
        }
        System.out.println(repeadStr(".",2*n+1) + repeadStr("*",n-2) + repeadStr(".", 2*n+1));


    }

    static String repeadStr(String str, int count) {
        StringBuilder repeated = new StringBuilder();

        for (int i = 0; i < count; i++) {
            repeated.append(str);

        }
        return repeated.toString();
    }
}
