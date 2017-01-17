package mitaka206.Exams_o3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 19.10.2016 г..
 */
public class HotelRoom {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String month = console.nextLine().toLowerCase();
        int sleaps = Integer.parseInt(console.nextLine());
        double priceAp = 0;
        double priceStud = 0;

        if (month.equals("may") || month.equals("october")) {

            if (sleaps > 14) {
                priceAp = sleaps*65 * 0.9;
                priceStud = sleaps*50 * 0.7;
            } else if (sleaps > 7) {
                priceAp = sleaps*65;
                priceStud = sleaps*50 * 0.95;
            } else {
                priceAp = sleaps*65;
                priceStud = sleaps*50;
            }
        } else if (month.equals("june") || month.equals("september")) {

            if (sleaps > 14) {
                priceAp = sleaps*68.7 * 0.9;
                priceStud = sleaps*75.2 * 0.8;
            } else {
                priceAp = sleaps*68.7;
                priceStud = sleaps*75.2;
            }
        } else if (month.equals("july") || month.equals("august")) {

            if (sleaps > 14) {
                priceAp = sleaps*77 * 0.9;
                priceStud = sleaps*76;
            } else {
                priceAp = sleaps*77;
                priceStud = sleaps*76;
            }
        }
        System.out.printf("Apartment: %.2f lv.",priceAp);
        System.out.println();
        System.out.printf("Studio: %.2f lv.",priceStud);
    }
}
