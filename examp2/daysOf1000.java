package mitaka206.examp2;

import java.util.Scanner;

public class daysOf1000 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String text = console.nextLine();
        String[] dateElements = text.split("[-]");
        String dayString = dateElements[0];
        String monthString = dateElements[1];
        String yearString = dateElements[2];

        int day = Integer.parseInt(dayString);
        int month = Integer.parseInt(monthString);
        int year = Integer.parseInt(yearString);

        System.out.printf("%s-%s-%s", day, month, year);
    }
}
