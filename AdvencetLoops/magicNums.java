package mitaka206.AdvencetLoops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 15.11.2016 г..
 */
public class magicNums {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int f = 1; f <= 9; f++) {
                        for (int l = 1; l <= 9; l++) {
                            for (int r = 1; r <= 9; r++) {
                                if (i*j*k*f*l*r==n){
                                    System.out.printf("%d%d%d%d%d%d ",i,j,k,f,l,r);
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
