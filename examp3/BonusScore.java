package mitaka206.examp3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 6.10.2016 г..
 */
public class BonusScore {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num = Double.parseDouble(console.nextLine());
        if (num<=100 && num %2 == 0)
        {
            double bonus = 5+1;
            double total = num+bonus;
            System.out.println(bonus);
            System.out.println(total);
        }else if (num<=100 && num %10 == 5)
        {
            double bonus = 5+2;
            double total = num+bonus;
            System.out.println(bonus);
            System.out.println(total);
        }else if (num<=100 && num %2 != 0)
        {
            double bonus = 5;
            double total = num+bonus;
            System.out.println(bonus);
            System.out.println(total);
        }
        else if (num>=100 && num<1000 && num %10 == 5)
        {
            double bonus = 2+num*0.2;
            double total = num+bonus;
            System.out.println(bonus);
            System.out.println(total);
        }else if (num>=100 && num<1000 && num %10 != 5 && num %2==0)
        {
            double bonus = 1+num*0.2;
            double total = num+bonus;
            System.out.println(bonus);
            System.out.println(total);
        }else if (num>=100 && num<1000 && num %10 != 5 && num %2!=0)
        {
            double bonus = num*0.2;
            double total = num+bonus;
            System.out.println(bonus);
            System.out.println(total);
        }else if (num>=1000 && num %10 == 5)
        {
            double bonus = 2+ num*0.1;
            double total = num+bonus;
            System.out.println(bonus);
            System.out.println(total);
        }else if (num>=1000 && num %10 != 5 && num %2==0)
        {
            double bonus =1+ num*0.1;
            double total = num+bonus;
            System.out.println(bonus);
            System.out.println(total);
        }else if (num>=1000 && num %10 != 5 && num %2!=0)
        {
            double bonus = num*0.1;
            double total = num+bonus;
            System.out.println(bonus);
            System.out.println(total);
        }
    }
}
