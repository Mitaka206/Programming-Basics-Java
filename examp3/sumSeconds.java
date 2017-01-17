package mitaka206.examp3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 6.10.2016 г..
 */
public class sumSeconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sec1 = Integer.parseInt(console.nextLine());
        int sec2 = Integer.parseInt(console.nextLine());
        int sec3 = Integer.parseInt(console.nextLine());
        int secs = sec1 + sec2 + sec3;
        int min = secs/60;
        int sec = secs%60;
        //Операторът "/" връща цялата част при делението на две целочислени числа, например 124 / 60 ще даде ризултат 2.
        //Операторът "%" връща остатка при деление на две целочислени числа, например 124 % 60 ще даде резултат 4.
        System.out.printf("%d:%02d", min, sec);

        }

    }




