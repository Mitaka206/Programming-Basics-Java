package mitaka206.examp1;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 28.9.2016 г..
 */
public class proba_star2 {
    public static void main(String[] args) {
        Scanner row = new Scanner(System.in);
        int norow = row.nextInt();
        int nomberofColums = 1;
        int noofrow = (norow+1)/2;
        for (int i=1;i<=norow;i++)
        {
            for (int j=1;j<=nomberofColums;j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i<noofrow)
            {
                nomberofColums = nomberofColums + 1;
            }
            else
            {
                nomberofColums = nomberofColums - 1;
            }


        }


    }
}
