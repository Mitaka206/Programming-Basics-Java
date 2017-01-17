package mitaka206.AdvencetLoops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 6.11.2016 г..
 */
public class SumDigits {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum = 0;
        do {
            sum = sum + n % 10; //0+ остатъка(123,4 -> 12,3 -> 1,2 -> 0,1)
            n /= 10; // 1234/10=123 -> 123/10=12 -> 12/10=1 -> n=0 => излизаме от цикъла
        } while (n > 0);
        System.out.println(sum);
    }
}
