package mitaka206.Exams_o3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 12.10.2016 г..
 */
public class RepairsPlac {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double N = Double.parseDouble(console.nextLine());
        double W = Double.parseDouble(console.nextLine());
        double L = Double.parseDouble(console.nextLine());
        double M = Double.parseDouble(console.nextLine());
        double O = Double.parseDouble(console.nextLine());

            double total = (N * N - M * O) / (W * L);
            double totalmin = total * 0.2;

            System.out.println(total);
            System.out.println(totalmin);

    }
}
