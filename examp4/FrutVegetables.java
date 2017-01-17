package mitaka206.examp4;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 14.10.2016 г..
 */
public class FrutVegetables {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String product = console.nextLine();

        if (product.equals("tomato") || product.equals("cucumber") || product.equals("pepper") || product.equals("carrot")){
            System.out.println("vegetable");
        }else if (product.equals("banana") || product.equals("apple") || product.equals("kiwi") || product.equals("cherry") || product.equals("lemon") || product.equals("grapes")){
            System.out.println("fruit");
        }else {
            System.out.println("unknown");
        }
    }
}
