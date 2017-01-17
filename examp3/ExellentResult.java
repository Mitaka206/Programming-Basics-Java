package mitaka206.examp3;

import java.util.Scanner;

/**
 * Created by Mitko on 6.10.2016 г..
 */
public class ExellentResult {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double score = Double.parseDouble(console.nextLine());
        if (score>=5.5)
        {
            System.out.println("Excellent!");
        }else
            System.out.println();
    }
}
