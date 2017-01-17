package ProbniLops;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 20.10.2016 г..
 */
public class Wili {
    public static void main(String[] args) {

        int g=0;
        int t=5;
        while ( g<4){ // повтаря докато условието стане грешно (3+)
            g++;      //добадя +1 към променливата (0)
            System.out.println(g); //т.е. при =4 вече НЕ е изпълнено и спира да работи
        }
        System.out.println();
        while (t>1){ // при =1 вече НЕ е изпълнено и спира да работи
            t--;     //изважда -1 от променливата (5)
            System.out.println(t);
        }


    }
}
