package mitaka206.examp2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class daysofbirth1000 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(s, format);
        LocalDate time = date.plusDays(999);

        System.out.println(time.format(format));

    }
}
