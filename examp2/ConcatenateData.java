package mitaka206.examp2;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String fstn = console.nextLine();
        String lstn = console.nextLine();
        int age = Integer.parseInt(console.nextLine());
        String twn = console.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.", fstn, lstn, age, twn);
    }
}
