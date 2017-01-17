package mitaka206.Exams_o3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 8.10.2016 г..
 */
public class poolP {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double V = Double.parseDouble(console.nextLine());
        double p1 = Double.parseDouble(console.nextLine());
        double p2 = Double.parseDouble(console.nextLine());
        double hrs = Double.parseDouble(console.nextLine());

        double ofV = Math.round((hrs * (p1 + p2) / V) * 100);
        double ofp1 = Math.floor((p1 / (p1 + p2)) * 100);
        double ofp2 = Math.floor((p2 / (p1 + p2)) * 100);

        //if (V >= 1 && V <= 10000 && p1 >= 1 && p1 <= 5000 && p2 >= 1 && p2 <= 5000 && hrs >= 1 && hrs <= 24) {

            if (V >= (hrs*(p1+p2))) {
                String s = "%"; //The pool is ....% full. Pipe 1: ....%. Pipe 2: .....%.
                System.out.printf("The pool is %.0f%s full. Pipe 1: %.0f%s. Pipe 2: %.0f%s.", ofV, s, ofp1,s, ofp2,s);
            }else if (V < (hrs*(p1+p2))) {
                double over = ofV - V; //For ..... hours the pool overflows with 400 liters.
                System.out.printf("For %.1f hours the pool overflows with %.0f liters.", hrs, over);
            }
        //}


    }
}
