package mitaka206.Exams_o3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 19.10.2016 г..
 */
public class DayliProfit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int workDay = Integer.parseInt(console.nextLine());
        double dayMoney = Double.parseDouble(console.nextLine());
        double bgnUsd = Double.parseDouble(console.nextLine());

          double monthProfit = workDay*dayMoney;
          double yearlyProfit = monthProfit*12+monthProfit*2.5;
          double taxProfit = yearlyProfit*0.75;
          double profitInBGN = (taxProfit/365)*bgnUsd;

        System.out.printf("%.2f", profitInBGN);

    }
}
