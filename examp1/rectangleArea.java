package mitaka206.examp1;


import java.util.Scanner;

public class rectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height, width, area;
        height = input.nextDouble();
        width = input.nextDouble();
        area = height * width;
        System.out.println("Area: " + area);
    }
}
