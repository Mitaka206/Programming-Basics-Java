package mitaka206.examp2;

import java.util.Scanner;

/**
 * Created by Mitko _i_Stefi on 24.9.2016 г..
 */
public class curencyConvert {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double value1 = input.nextDouble();
            input.nextLine();
            String val1 = input.nextLine();
            String val2 = input.nextLine();
            double bgn = 1.00001;
            double eur = 1.95583;
            double usd = 1.79549;
            double gbp = 2.53405;

                if(val1.equals("USD"));
                if(val2.equals("EUR")){
                double value2 = value1 * usd/eur;
                System.out.printf("%.2f", value2);
                }
                if (val1.equals("USD"))
                if (val2.equals("BGN")){
                    double value2 = value1 * usd/bgn;
                    System.out.printf("%.2f", value2);
                }
                if (val1.equals("USD"))
                if (val2.equals("GBP")){
                    double value2 = value1 * usd/gbp;
                    System.out.printf("%.2f", value2);
                }
                if (val1.equals("BGN"))
                if (val2.equals("USD")){
                    double value22 = value1 * bgn/usd;
                    System.out.printf("%.2f", value22);
                } if (val1.equals("BGN"))
                if (val2.equals("GBP")){
                    double value21 = value1 * bgn/gbp;
                    System.out.printf("%.2f", value21);
                } if (val1.equals("GBP"))
                if (val2.equals("EUR")){
                    double value33 = value1 * gbp/eur;
                    System.out.printf("%.2f", value33);
                } if (val1.equals("GBP"))
                if (val2.equals("USD")){
                    double value32 = value1 * gbp/usd;
                    System.out.printf("%.2f", value32);
                } if (val1.equals("GBP"))
                if (val2.equals("BGN")){
                    double value31 = value1 * gbp/bgn;
                    System.out.printf("%.2f", value31);
                } if (val1.equals("EUR"))
                if (val2.equals("USD")){
                    double value43 = value1 * eur/usd;
                    System.out.printf("%.2f", value43);
                } if (val1.equals("EUR"))
                if (val2.equals("BGN")){
                    double value42 = value1 * eur/bgn;
                    System.out.printf("%.2f", value42);
                } if (val1.equals("EUR"))
                if (val2.equals("GBP")){
                    double value41 = value1 * eur/gbp;
                    System.out.printf("%.2f", value41);
                } if (val1.equals("BGN"))
                if (val2.equals("EUR")){
                    double value41 = value1 * bgn/1.95583;
                    System.out.printf("%.2f", value41);
                }

        }

    }

