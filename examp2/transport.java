package mitaka206.examp2;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 3.10.2016 г..
 */
public class transport {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int km = Integer.parseInt(console.nextLine());
        String dayNight = console.nextLine();
        double on, dayTX, nightTX;
        on = 0.7;
        dayTX = 0.79;
        nightTX = 0.9;
        double bus = 0.09;
        double train = 0.06;
        if (km <= 5000 && km>=1) {

            if (km < 20) {
                if (dayNight.equals("day")) {
                    double ofTX = on + dayTX * km;
                    System.out.printf("%.2f", ofTX);
                }
                if (dayNight.equals("night")) {
                    double ofTX = on + nightTX * km;
                    System.out.printf("%.2f", ofTX);
                }
            }
            if (km >= 20 && km < 100) {
                if (dayNight.equals("day") || dayNight.equals("night")) {
                    double ofbus = km * bus;
                    System.out.printf("%.2f", ofbus);
                }
            }
            if (km >= 100) {
                if (dayNight.equals("day") || dayNight.equals("night")) {
                    double oftrain = km * train;
                    System.out.printf("%.2f", oftrain);
                }
            }
        }
    }
    }

