package mitaka206.examp3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 8.10.2016 г..
 */
public class SpeedInfo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double speed = Double.parseDouble(console.nextLine());

        if (speed<=10){
            System.out.println("slow");
        }else if (speed>10 && speed<=50){
            System.out.println("average");
        }else if (speed>50 && speed<=150){
            System.out.println("fast");
        }else if (speed>150 && speed<=1000){
            System.out.println("ultra fast");
        }else if (speed>1000){
            System.out.println("extremely fast");
        }
    }
}
