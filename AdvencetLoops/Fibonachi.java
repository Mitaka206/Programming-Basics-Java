package mitaka206.AdvencetLoops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 6.11.2016 г..
 */
public class Fibonachi {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int f0 = 1;
        int f1 = 1;

        for (int i = 0; i < n - 1; i++) {
            int fn = f0 + f1;
            f0 = f1;
            f1 = fn;
            //System.out.println(f1);
        }
       System.out.println(f1);
    }
}
