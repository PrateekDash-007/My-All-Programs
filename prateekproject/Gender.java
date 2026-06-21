 import java.util.InputMismatchException;
 import java.util.Scanner;
public class Gender {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    try {
        System.out.println("Enter your name");
        String name=s.next();
        System.out.println("Enter your Gender");
        char gender=s.next().charAt(0);
        System.out.println("Enter your age");
        int age=s.nextInt();
        System.out.println("Enter your mob no.");
        long phno=s.nextLong();
        System.out.println("name:"+name);
        System.out.println("gender:"+gender);
        System.out.println("age:"+age);
        System.out.println("phno:"+phno);
    } catch (InputMismatchException e) {
        System.out.println("Error: Invalid input. Age must be an integer and phone number must be numeric.");
    } finally {
        s.close();
    }

    }
}
