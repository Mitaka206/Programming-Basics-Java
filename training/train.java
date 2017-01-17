import java.util.Scanner;

/**
 * Created by Mitaka206 on 25.10.2016 г..
 */
public class train {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        System.out.println((n-1)/2-1);
    }
}
