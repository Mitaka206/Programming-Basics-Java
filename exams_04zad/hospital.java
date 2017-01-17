package exaps_04zad;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 25.10.2016 г..
 */
public class hospital {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int period = Integer.parseInt(console.nextLine());

        int pregledani = 0;
        int nePregledani = 0;
        int doctors = 7;

        for (int n = 1; n <= period; n++) {
            int pacienti = Integer.parseInt(console.nextLine());
            if (n%3==0 && nePregledani>doctors){
                doctors++;
            }
            if (pacienti>doctors){
                pregledani +=doctors;
                nePregledani += pacienti-doctors;
            }else {
                pregledani+=pacienti;
            }
        }


        System.out.printf("Treated patients: %d%n", pregledani);
        System.out.printf("Untreated patients: %d%n", nePregledani);


    }
}
