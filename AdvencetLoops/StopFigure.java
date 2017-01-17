package mitaka206.AdvencetLoops;

import java.util.Scanner;

/**
 * Created by Mitaka206 on 19.11.2016 г..
 */
public class StopFigure {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int mid = n * 2 - 1;

        System.out.println(repeadStr(".", n + 1) + repeadStr("_", n * 2 + 1) + repeadStr(".", n + 1));

        int point = n;
        for (int i = 0; i < n; i++) {
            System.out.println(repeadStr(".", point) + "//" + repeadStr("_", mid) + "\\\\" + repeadStr(".", point));
            point--;
            mid += 2;
        }

        int midstop = mid;
        midstop -= 5;
        midstop /= 2;
        System.out.println("//" + repeadStr("_", midstop) + "STOP!" + repeadStr("_", midstop) + "\\\\");

        point=0;
        mid=n*4-1;
        for (int i = 0; i < n; i++) {
            System.out.println(repeadStr(".",point)+ "\\\\"+repeadStr("_",mid)+"//"+ repeadStr(".",point));
            point++;
            mid-=2;

        }
    }

    static String repeadStr(String str, int count) {
        StringBuilder repeated = new StringBuilder();

        for (int i = 0; i < count; i++) {
            repeated.append(str);

        }
        return repeated.toString();
    }
}
