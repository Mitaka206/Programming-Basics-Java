package mitaka206.AdvencetLoops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 15.11.2016 г..
 */
public class StupidPass {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int l = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 'a'; k < 'a' + l; k++) {
                    for (int m = 'a'; m < 'a' + l; m++) {
                        for (int o = Math.max(i, j) + 1; o <= n; o++) {
                            System.out.printf("%d%d%c%c%d ", i, j, k, m, o);
                        }
                    }
                }
            }
        }

    }
}
