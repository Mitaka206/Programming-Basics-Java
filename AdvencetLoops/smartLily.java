package mitaka206.AdvencetLoops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 19.11.2016 г..
 */
public class smartLily {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int age = Integer.parseInt(console.nextLine());
        double washMashine = Double.parseDouble(console.nextLine());
        double toyPrice = Double.parseDouble(console.nextLine());
        
        int bonus = 10;
        int spesteni = 0;
        int toy = 0;

        for (int i = 1 ; i <= age; i++) {
            if (i%2==0){
                spesteni+=bonus;
                spesteni--;
                bonus+=10;
            }else {
                toy++;
            }
        }
        double fullMoney = spesteni+toy*toyPrice;
        if (fullMoney>=washMashine){
            System.out.printf("Yes! %.2f", fullMoney-washMashine);
        }else {
            System.out.printf("No! %.2f", washMashine-fullMoney);
        }
    }
}
