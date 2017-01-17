package DawingFiguresOficial;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 2.11.2016 г..
 */
public class Diamond {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int dash = (n - 1) / 2;


        for (int i = 0; i <=(n-1)/2; i++) {
            System.out.print(repeadStr("-", dash) + "*");

            int mid = (n - 2) - (dash * 2);
            if (mid >= 0) {
                System.out.print(repeadStr("-", mid) + "*");
            }

            System.out.println(repeadStr("-", dash));
            dash--;
        }
        dash=1;
        for (int i = 0; i <(n-1)/2; i++) {
            System.out.print(repeadStr("-", dash) + "*");

            int mid = (n - 2) - (dash * 2);
            if (mid >= 0) {
                System.out.print(repeadStr("-", mid) + "*");
            }

            System.out.println(repeadStr("-", dash));
            dash++;
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
