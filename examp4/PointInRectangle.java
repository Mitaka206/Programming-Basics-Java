package mitaka206.examp4;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 14.10.2016 г..
 */
public class PointInRectangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());
        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());

        if (x1 <= x && x2 >= x) {
            if (y >= y1 && y <= y2) {
                System.out.println("Inside");
            } else if (x1 >= x && x2 <= x) {
                if (y <= y1 && y >= y2) {
                    System.out.println("Inside");
                }else {
                    System.out.println("Outside");
                }
// трябва да се помисли за по-просто рещение
            }
        }
    }
}