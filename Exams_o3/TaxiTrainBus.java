package mitaka206.Exams_o3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 10.10.2016 г..
 */
public class TaxiTrainBus {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double n = Double.parseDouble(console.nextLine());
        String DorN = console.nextLine();
        if (n >= 1 && n < 20) {
            if (DorN.equals("day")) {
                double exit = n * 0.79 + 0.7;
                System.out.printf("%.2f", exit);
            } else if (DorN.equals("night")) {
                double exit = n * 0.9 + 0.7;
                System.out.printf("%.2f", exit);
            }
        } else if (n >= 20 && n < 100 && (DorN.equals("night") || DorN.equals("day"))) {
            double exit = n * 0.09;
            System.out.printf("%.2f", exit);
        } else if (n >= 100 && n < 5000 && DorN.equals("night")) {
            double exit = n * 0.06;
            System.out.printf("%.2f", exit);
        } else if (n >= 100 && n < 5000 && DorN.equals("day")) {
            double exit = n * 0.06;
            System.out.printf("%.2f", exit);
        }
    }
}
