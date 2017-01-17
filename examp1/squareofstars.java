package mitaka206.examp1;

import java.util.Scanner;

public class squareofstars {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the square: ");
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("*");
        }

        System.out.println(sb.toString());

        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        System.out.println(sb.toString());
    }
}