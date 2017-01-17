package mitaka206.IntroProgramming;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 15.11.2016 г..
 */
public class numsOfBGtext {
//Напишете програма, която за дадена цифра (0-9), зададена като вход, извежда името на цифрата на български език
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());

        switch (a){
            case 0:
                System.out.println("нула");break;
            case 1:
                System.out.println("едно");break;
            case 2:
                System.out.println("две");break;
            case 3:
                System.out.println("три");break;
            case 4:
                System.out.println("четири");break;
            case 5:
                System.out.println("пет");break;
            case 6:
                System.out.println("шест");break;
            case 7:
                System.out.println("седем");break;
            case 8:
                System.out.println("осем");break;
            case 9:
                System.out.println("девет");break;
            default:
                System.out.println("Error");
        }

    }
}
