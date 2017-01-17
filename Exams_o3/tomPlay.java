package mitaka206.Exams_o3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 12.10.2016 г..
 */
public class tomPlay {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int freeDays = Integer.parseInt(console.nextLine());

        int work = 365-freeDays;
        int playMins = work*63 + freeDays*127;
        if (playMins>30000){
            int play = Math.abs(30000-playMins);
            int h = play/60;
            int m = play%60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",h ,m);
        }else if (playMins<30000){
            int play = 30000-playMins;
            int h = play/60;
            int m = play%60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",h ,m);
        }
    }
}
