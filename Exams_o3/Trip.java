package mitaka206.Exams_o3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 12.10.2016 г..
 */
public class Trip {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        String season = console.nextLine().toLowerCase();
        if (budget>=10 && budget<=5000){
            if (budget<=100){
                System.out.println("Somewhere in Bulgaria");
                if (season.equals("summer")){
                    double free = budget*0.3;
                    System.out.printf("Camp - %.2f", free);
                }else if (season.equals("winter")){
                    double free = budget*0.7;
                    System.out.printf("Hotel - %.2f", free);
                }
            }else if (budget>100 && budget<=1000){
                System.out.println("Somewhere in Balkans");
                if (season.equals("summer")){
                    double free = budget*0.4;
                    System.out.printf("Camp - %.2f", free);
                }else if (season.equals("winter")) {
                    double free = budget * 0.8;
                    System.out.printf("Hotel - %.2f", free);
                }
            }else if (budget>1000){
                if (season.equals("summer") || season.equals("winter")){
                    double free = budget*0.9;
                    System.out.println("Somewhere in Europe");
                    System.out.printf("Hotel - %.2f", free);
                }
            }
        }
    }
}
