package mitaka206.a01samostoqt;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 20.11.2016 г..
 */
public class battle {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int p1 = Integer.parseInt(console.nextLine());
        int p2 = Integer.parseInt(console.nextLine());
        int bat = Integer.parseInt(console.nextLine());

        int b1 = 0;

        for (int i = 1; i <= p1; i++) {
            for (int j = 1; j <= p2; j++) {
                b1++;
                if (b1 > bat) {
                    break;
                } else {
                    System.out.printf("( %d <-> %d )", i, j);
                }
            }

        }

    }
}
