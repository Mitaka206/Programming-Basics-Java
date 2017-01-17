package mitaka206.examp3;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 8.10.2016 г..
 */
public class num100to200 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());

        if (num<100){
            System.out.println("Less than 100");
        }else if (num>=100 && num<=200){
            System.out.println("Between 100 and 200");
        }else if (num>200){
            System.out.println("Greater than 200");
        }
    }
}
