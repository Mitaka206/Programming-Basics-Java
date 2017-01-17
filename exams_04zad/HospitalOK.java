package exaps_04zad;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 26.10.2016 г..
 */
public class HospitalOK {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int period = Integer.parseInt(console.nextLine());

        int treated = 0;
        int untreated = 0;
        int doctors = 7;

        for (int day = 1; day <= period; day++)
        {
            int patients = Integer.parseInt(console.nextLine());

            if ((day % 3 == 0) && (untreated > treated))
            {
                doctors++;
            }

            if (patients > doctors)
            {
                treated += doctors;
                untreated += patients - doctors;
            }
            else
            {
                treated += patients;
            }
        }

        System.out.printf("Treated patients: %d.%n", treated);
        System.out.printf("Untreated patients: %d.", untreated);

    }
}
