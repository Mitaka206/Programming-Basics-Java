package mitaka206.AdvencetLoops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 19.11.2016 г..
 */
public class hospital {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int period = Integer.parseInt(console.nextLine());

        int doctors = 7;

        int pregledani = 0;
        int nepregledani = 0;

        for (int i = 1; i <= period; i++) {
            int people = Integer.parseInt(console.nextLine());

            if (i % 3 == 0 && nepregledani > 0) {
                doctors++;
            }

            if (people > doctors) {
                pregledani += doctors;
                nepregledani += pregledani - doctors;
            } else {
                pregledani += people;
            }

        }

        System.out.println(pregledani);
        System.out.println(nepregledani);

    }
}


