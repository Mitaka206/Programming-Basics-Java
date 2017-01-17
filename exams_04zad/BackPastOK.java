package exaps_04zad;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 26.10.2016 г..
 */
public class BackPastOK {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double nasledstvo = Double.parseDouble(console.nextLine());
        double endYear = Double.parseDouble(console.nextLine());

        double years = 18;

        for (int i = 1800; i <= endYear; i++)
        {
            if (i % 2 == 0)
            {
                nasledstvo -= 12000;
            }
            else
            {
                nasledstvo -= (12000 + 50 * years);
            }
            years++;
        }
        if (nasledstvo < 0)
        {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(nasledstvo));
        }
        else
        {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", nasledstvo);
        }


    }
}
