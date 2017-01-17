package mitaka206.Exams_o3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 10.10.2016 г..
 */
public class timeExam {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int hE = Integer.parseInt(console.nextLine());
        int mE = Integer.parseInt(console.nextLine());
        int hp = Integer.parseInt(console.nextLine());
        int mp = Integer.parseInt(console.nextLine());
        int capMin = 60 * (hp - hE - 1) + (60 + (mp - mE));

        if (capMin > 0) {
            System.out.println("Late");
            if (capMin >= 60 && capMin > 0) {
                int h = capMin / 60;
                int m = capMin % 60;
                System.out.printf("%d:%02d hours after the start", h, m);
            } else {
                System.out.printf("%d minutes after the start", capMin);
            }
        } else if (capMin >= -30 && capMin <= 0) {
            if (capMin == 0) {
                System.out.println("On time");
            } else {
                System.out.println("On time");
                int absCap = Math.abs(capMin);
                System.out.printf("%d minutes before the start", absCap);
            }
        } else if (capMin < -30) {
            System.out.println("Early");
            if (capMin > -60 && capMin < -30) {
                int absCap = Math.abs(capMin);
                System.out.printf("%d minutes before the start", absCap);
            } else if (capMin <= -60) {
                int h = Math.abs(capMin / 60);
                int m = Math.abs(capMin % 60);
                System.out.printf("%d:%02d hours before the start", h, m);

            }
        }
    }
}
