package mitaka206.Exams_o3;

import java.util.Scanner;

public class lernRoom {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double h, w; //v metri
        h = Double.parseDouble(console.nextLine());
        w = Double.parseDouble(console.nextLine());

            double mestanaRow =Math.floor((w-1)/0.7);
            double mestaCol =Math.floor(h/1.2);
            double obsto = (mestanaRow*mestaCol)-3;

        if (3<=h || h<=w || w<=100)
        {
            System.out.println(obsto);
        }
    }
}
