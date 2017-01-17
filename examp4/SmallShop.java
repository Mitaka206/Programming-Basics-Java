package mitaka206.examp4;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 14.10.2016 г..
 */
public class SmallShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String article = console.nextLine().toLowerCase();
        String town = console.nextLine().toLowerCase();
        double sum = Double.parseDouble(console.nextLine());
        if (town.equals("sofia")){
            if (article.equals("coffee")){
                double total = sum*0.5;
                System.out.printf("%.2f",total);
            }else if (article.equals("water")){
                double total = sum*0.8;
                System.out.printf("%.2f",total);
            }else if (article.equals("beer")){
                double total = sum*1.20;
                System.out.printf("%.2f",total);
            }else if (article.equals("sweets")){
                double total = sum*1.45;
                System.out.printf("%.2f",total);
            }else if (article.equals("peanuts")){
                double total = sum*1.60;
                System.out.printf("%.2f",total);
            }
        }else if (town.equals("varna")){
            if (article.equals("coffee")){
                double total = sum*0.45;
                System.out.printf("%.2f",total);
            }else if (article.equals("water")){
                double total = sum*0.7;
                System.out.printf("%.2f",total);
            }else if (article.equals("beer")){
                double total = sum*1.10;
                System.out.printf("%.2f",total);
            }else if (article.equals("sweets")){
                double total = sum*1.35;
                System.out.printf("%.2f",total);
            }else if (article.equals("peanuts")){
                double total = sum*1.55;
                System.out.printf("%.2f",total);
            }
        }else if (town.equals("plovdiv")){
            if (article.equals("coffee")){
                double total = sum*0.40;
                System.out.printf("%.2f",total);
            }else if (article.equals("water")){
                double total = sum*0.7;
                System.out.printf("%.2f",total);
            }else if (article.equals("beer")){
                double total = sum*1.15;
                System.out.printf("%.2f",total);
            }else if (article.equals("sweets")){
                double total = sum*1.3;
                System.out.printf("%.2f",total);
            }else if (article.equals("peanuts")){
                double total = sum*1.5;
                System.out.printf("%.2f",total);
            }
        }
    }
}
