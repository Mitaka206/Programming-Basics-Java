package mitaka206.examp3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 8.10.2016 г..
 */
public class TimePlus15 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int hour = Integer.parseInt(console.nextLine());
        int min = Integer.parseInt(console.nextLine());
        int mns = hour*60 + min + 15;
        int h1 = mns/60;
        int m1 = mns%60;

        if (h1>=24){
            int ff = h1-24;
            System.out.printf("%d:%02d", ff, m1);
        }else if (h1<24) {
            System.out.printf("%d:%02d", h1, m1);
        }
    }
}
