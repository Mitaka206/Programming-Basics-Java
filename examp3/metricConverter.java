package mitaka206.examp3;

import java.util.Scanner;

/**
 * Created by Mitko  on 7.10.2016 г..
 */
public class metricConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num = Double.parseDouble(console.nextLine());
        String m1 = console.nextLine();
        String m2 = console.nextLine();

        double mm = 1000;
        double sm = 100;
        double in = 39.3700787;
        double ft = 3.2808399;
        double yd = 1.0936133;
        double m = 1;
        double km = 0.001;
        double mi = 0.000621371192;

        // mm,sm,in,ft,yd<m>km,mi
        if (m1.equals("m")){
            if (m2.equals("mm")){
                double exit = num*m*mm;
                System.out.printf("%f mm", exit);
            }else if (m2.equals("sm")){
                double exit = num*m*sm;
                System.out.printf("%f sm", exit);
            }else if (m2.equals("in")){
                double exit = num*m*in;
                System.out.printf("%f in", exit);
            }else if (m2.equals("ft")){
                double exit = num*m*ft;
                System.out.printf("%f ft", exit);
            }else if (m2.equals("yd")){
                double exit = num*m*yd;
                System.out.printf("%f yd", exit);
            }else if (m2.equals("m")){
                double exit = num*m/m;
                System.out.printf("%f m", exit);
            }else if (m2.equals("km")){
                double exit = num*m*km;
                System.out.printf("%f km", exit);
            }else if (m2.equals("mi")){
                double exit = num*m*mi;
                System.out.printf("%f mi", exit);
            }
        }

        if (m1.equals("mm")){
            if (m2.equals("mm")){
                double exit = num*mm/mm;
                System.out.printf("%f mm", exit);
            }else if (m2.equals("sm")){
                double exit = num*sm/mm;
                System.out.printf("%f sm", exit);
            }else if (m2.equals("in")){
                double exit = num*in/mm;
                System.out.printf("%f in", exit);
            }else if (m2.equals("ft")){
                double exit = num*ft/mm;
                System.out.printf("%f ft", exit);
            }else if (m2.equals("yd")){
                double exit = num*yd/mm;
                System.out.printf("%f yd", exit);
            }else if (m2.equals("m")){
                double exit = num*m/mm;
                System.out.printf("%f m", exit);
            }else if (m2.equals("km")){
                double exit = num*km/mm;
                System.out.printf("%f km", exit);
            }else if (m2.equals("mi")){
                double exit = num*mi/mm;
                System.out.printf("%f mi", exit);
            }
        }

        if (m1.equals("sm")){
            if (m2.equals("mm")){
                double exit = num*mm/sm;
                System.out.printf("%f mm", exit);
            }else if (m2.equals("sm")){
                double exit = num*sm/sm;
                System.out.printf("%f sm", exit);
            }else if (m2.equals("in")){
                double exit = num*in/sm;
                System.out.printf("%f in", exit);
            }else if (m2.equals("ft")){
                double exit = num*ft/sm;
                System.out.printf("%f ft", exit);
            }else if (m2.equals("yd")){
                double exit = num*yd/sm;
                System.out.printf("%f yd", exit);
            }else if (m2.equals("m")){
                double exit = num*m/sm;
                System.out.printf("%f m", exit);
            }else if (m2.equals("km")){
                double exit = num*km/sm;
                System.out.printf("%f km", exit);
            }else if (m2.equals("mi")){
                double exit = num*mi/sm;
                System.out.printf("%f mi", exit);
            }
        }

        if (m1.equals("in")){
            if (m2.equals("mm")){
                double exit = num*mm/in;
                System.out.printf("%f mm", exit);
            }else if (m2.equals("sm")){
                double exit = num*sm/in;
                System.out.printf("%f sm", exit);
            }else if (m2.equals("in")){
                double exit = num*in/in;
                System.out.printf("%f in", exit);
            }else if (m2.equals("ft")){
                double exit = num*ft/in;
                System.out.printf("%f ft", exit);
            }else if (m2.equals("yd")){
                double exit = num*yd/in;
                System.out.printf("%f yd", exit);
            }else if (m2.equals("m")){
                double exit = num*m/in;
                System.out.printf("%f m", exit);
            }else if (m2.equals("km")){
                double exit = num*km/in;
                System.out.printf("%f km", exit);
            }else if (m2.equals("mi")){
                double exit = num*mi/in;
                System.out.printf("%f mi", exit);
            }
        }

        if (m1.equals("ft")){
            if (m2.equals("mm")){
                double exit = num*mm/ft;
                System.out.printf("%f mm", exit);
            }else if (m2.equals("sm")){
                double exit = num*sm/ft;
                System.out.printf("%f sm", exit);
            }else if (m2.equals("in")){
                double exit = num*in/ft;
                System.out.printf("%f in", exit);
            }else if (m2.equals("ft")){
                double exit = num*ft/ft;
                System.out.printf("%f ft", exit);
            }else if (m2.equals("yd")){
                double exit = num*yd/ft;
                System.out.printf("%f yd", exit);
            }else if (m2.equals("m")){
                double exit = num*m/ft;
                System.out.printf("%f m", exit);
            }else if (m2.equals("km")){
                double exit = num*km/ft;
                System.out.printf("%f km", exit);
            }else if (m2.equals("mi")){
                double exit = num*mi/ft;
                System.out.printf("%f mi", exit);
            }
        }
        if (m1.equals("yd")){
            if (m2.equals("mm")){
                double exit = num*mm/yd;
                System.out.printf("%f mm", exit);
            }else if (m2.equals("sm")){
                double exit = num*sm/yd;
                System.out.printf("%f sm", exit);
            }else if (m2.equals("in")){
                double exit = num*in/yd;
                System.out.printf("%f in", exit);
            }else if (m2.equals("ft")){
                double exit = num*ft/yd;
                System.out.printf("%f ft", exit);
            }else if (m2.equals("yd")){
                double exit = num*yd/yd;
                System.out.printf("%f yd", exit);
            }else if (m2.equals("m")){
                double exit = num*m/yd;
                System.out.printf("%f m", exit);
            }else if (m2.equals("km")){
                double exit = num*km/yd;
                System.out.printf("%f km", exit);
            }else if (m2.equals("mi")){
                double exit = num*mi/yd;
                System.out.printf("%f mi", exit);
            }
        }

        if (m1.equals("km")){
            if (m2.equals("mm")){
                double exit = num*mm/km;
                System.out.printf("%f mm", exit);
            }else if (m2.equals("sm")){
                double exit = num*sm/km;
                System.out.printf("%f sm", exit);
            }else if (m2.equals("in")){
                double exit = num*in/km;
                System.out.printf("%f in", exit);
            }else if (m2.equals("ft")){
                double exit = num*ft/km;
                System.out.printf("%f ft", exit);
            }else if (m2.equals("yd")){
                double exit = num*yd/km;
                System.out.printf("%f yd", exit);
            }else if (m2.equals("m")){
                double exit = num*m/km;
                System.out.printf("%f m", exit);
            }else if (m2.equals("km")){
                double exit = num*km/km;
                System.out.printf("%f km", exit);
            }else if (m2.equals("mi")){
                double exit = num*mi/km;
                System.out.printf("%f mi", exit);
            }
        }
        if (m1.equals("mi")){
            if (m2.equals("mm")){
                double exit = num*mm/mi;
                System.out.printf("%f mm", exit);
            }else if (m2.equals("sm")){
                double exit = num*sm/mi;
                System.out.printf("%f sm", exit);
            }else if (m2.equals("in")){
                double exit = num*in/mi;
                System.out.printf("%f in", exit);
            }else if (m2.equals("ft")){
                double exit = num*ft/mi;
                System.out.printf("%f ft", exit);
            }else if (m2.equals("yd")){
                double exit = num*yd/mi;
                System.out.printf("%f yd", exit);
            }else if (m2.equals("m")){
                double exit = num*m/mi;
                System.out.printf("%f m", exit);
            }else if (m2.equals("km")){
                double exit = num*km/mi;
                System.out.printf("%f km", exit);
            }else if (m2.equals("mi")){
                double exit = num*mi/mi;
                System.out.printf("%f mi", exit);
            }
        }
    }
}
