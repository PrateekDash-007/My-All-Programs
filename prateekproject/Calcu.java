import java.util.Scanner;
public class Calcu {public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter first number");
    int no1=s.nextInt();
     System.out.println("Enter second number");
    int no2=s.nextInt();
     System.out.println("select symble(+.-,*,/)");
    String sym=s.next();
    int res;
    switch (sym) {
        case("+") :res=no1+no2;
        System.out.println("Addition:"+res);
         break;
         case("-") :res=no1-no2;
        System.out.println("substation:"+res);   
            break;
            case("*") :res=no1*no2;
        System.out.println("multipication:"+res);   
            break;
            case("/") :res=no1/no2;
        System.out.println("divoision:"+res);   
            break;
        default:
        System.out.println("Are you mad");
            throw new AssertionError();
    }
}
    
}
