package mitaka206.examp4;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 14.10.2016 г..
 */
public class PersonalTitles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double age = Double.parseDouble(console.nextLine());
        String title = console.nextLine();
        if (age>=1 && age<16){
            if (title.equals("m")){
                System.out.println("Master");
            }else if (title.equals("f")){
                System.out.println("Miss");
            }
        }else if (age>=16){
            if (title.equals("m")){
                System.out.println("Mr.");
            }else if (title.equals("f")){
                System.out.println("Ms.");
            }
        }
    }
}
