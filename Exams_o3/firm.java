package mitaka206.Exams_o3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 19.10.2016 г..
 */
public class firm {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double hours = Double.parseDouble(console.nextLine());
        double days = Double.parseDouble(console.nextLine());
        double peoples = Double.parseDouble(console.nextLine());

        double realhours = days * 0.9 * 8;
        double overtimehours = peoples * 2 * days;
        double fulhours = Math.floor(realhours + overtimehours);

        if (fulhours >= hours) {
            double left = fulhours - hours;
            System.out.printf("Yes!%.0f hours left.", left);
        } else {
            double left = hours - fulhours;
            System.out.printf("Not enough time!%.0f hours needed.", left);
        }

    }
}
