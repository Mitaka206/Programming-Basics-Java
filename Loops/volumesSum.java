package mitaka206.Loops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 15.11.2016 г..
 */
public class volumesSum {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String text = console.nextLine();

        int sum = 0;

        for (int i = 0; i < text.length(); i++) { //върти до дължината на текста
            switch (text.charAt(i)){ //проверява буквите от i
                case 'a':
                    sum+=1;break;
                case 'e':
                    sum+=2;break;
                case 'i':
                    sum+=3;break;
                case 'o':
                    sum+=4;break;
                case 'u':
                    sum+=5;break;
            }
        }
        System.out.println(sum);

    }
}
