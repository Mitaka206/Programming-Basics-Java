package ProbniLops;

/**
 * Created by Mitko _i_Stefi on 20.10.2016 г..
 */
public class wili_Wili_do {
    public static void main(String[] args) {
        int n=0;
        do { // да се изпълнява условието...
            System.out.println(n++);   //0,1,2,3,4
            //n++;                     //
           // System.out.println(n);   //_,1,2,3,4,5
        }while (n<5);//1...докато се изпълни (т.е. до =4);2...докато не се изпълни (т.е. до =5)
            // при sout(n++)-цикъла се повтаря пет пъти от0до4
            // при втория вариант -цикъла се повтаря пет пъти от1до5
    }
}
