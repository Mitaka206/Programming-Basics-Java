package DawingFiguresOficial;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 2.11.2016 г..
 */
public class SquareFrame {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i < 1; i++) {
            System.out.println("+ "+ repeadStr("- ", n-2)+ "+");
        }
        for (int i = 0; i < n-2; i++) {
            System.out.println("| "+ repeadStr("- ", n-2)+ "|");
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("+ "+ repeadStr("- ", n-2)+ "+");
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

