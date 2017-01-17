package DawingFiguresOficial;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 2.11.2016 г..
 */
public class Stars10x10 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(repeadStr("*", 10));

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
