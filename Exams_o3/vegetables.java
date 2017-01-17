package mitaka206.Exams_o3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 28.9.2016 г..
 */
public class vegetables {
    public static void main(String[] args) {
        Scanner veg = new Scanner(System.in);
        double priceveg = veg.nextDouble();
        double pricefrut = veg.nextDouble();
        int kgveg = veg.nextInt();
        int kgfrut = veg.nextInt();
        double priceEUR = (priceveg*kgveg+pricefrut*kgfrut)/1.94;
        System.out.println(priceEUR);
    }
}
