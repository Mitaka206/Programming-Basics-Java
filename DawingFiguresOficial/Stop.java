package DawingFiguresOficial;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 3.11.2016 г..
 */
public class Stop {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int dot = n;
        int mid = 2 * n - 1;

        System.out.println(repeadStr(".", n + 1) + repeadStr("_", 2 * n + 1) + repeadStr(".", n + 1));
        for (int i = 0; i < n; i++) {
            System.out.println(repeadStr(".", dot) + "//" + repeadStr("_", mid) + "\\\\" + repeadStr(".", dot));
            dot--;
            mid += 2;
        }

        int mid3 = mid - 5;
        mid3 /= 2;
        System.out.println("//" + repeadStr("_", mid3) + "STOP!" + repeadStr("_", mid3) + "\\\\");

        int mid2 = 4 * n - 1;
        for (int i = 0; i < n; i++) {
            System.out.println(repeadStr(".", dot) + "\\\\" + repeadStr("_", mid2) + "//" + repeadStr(".", dot));
            dot++;
            mid2 -= 2;
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
