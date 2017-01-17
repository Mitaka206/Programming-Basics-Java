package Loops_homework;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 21.10.2016 г..
 */
public class VowelsSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word = console.nextLine().toLowerCase();

        int sum = 0;

        for (int i=0; i<word.length(); i++){
            switch (word.charAt(i)){
                case 'a': sum +=1; break;
                case 'e': sum +=2; break;
                case 'i': sum +=3; break;
                case 'o': sum +=4; break;
                case 'u': sum +=5; break;
            }
        }
        System.out.println(sum);
    }
}
