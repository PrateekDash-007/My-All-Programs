import java.util.Scanner;
public class Reverse2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
System.out.println("Enter your name ");
String name=s.nextLine();
int leng = name.length();
String rev="";
for(int i=leng-1;i>=0;i--){
    rev=rev+name.charAt(i);
}
System.out.println(rev);
    }
}
