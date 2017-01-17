package mitaka206.AdvencetLoops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 15.11.2016 г..
 */
public class specialNums {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            int sp1 = i / 1000;
            int sp2 = i / 100 % 10;
            int sp3 = i / 10 % 10;
            int sp4 = i % 10;
            if (sp2 != 0 && sp3 != 0 && sp4 != 0) {
                if (n % sp1 == 0 && n % sp2 == 0 && n % sp3 == 0 && n % sp4 == 0) {
                    System.out.printf("%d%d%d%d ", sp1, sp2, sp3, sp4);
                }
            }
        }
    }
}
