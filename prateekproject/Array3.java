import java.util.Scanner;
public class Array3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int a[] = null;
        int size = 0;
        while (true) {
            System.out.println("Welcome to Array class" + "\n" + "press 1 for creating an array" + "\n" + "press 2 for display your array" + "\n" + "press 3 for insert element in your array " + "\n" + "press 4 for deleting the element in your array" + "\n" + "" + "press 0 for exit");
            int c = sc.nextInt();

            switch (c) {
                case 1:
                    if (n > 0) {
                        System.out.println("Array is already created,try insearting and deleting in array ");
                        break;
                    }

                    System.out.println("Enter maximum size of your array ");
                    size = sc.nextInt();
                    a = new int[size];
                    System.out.println("Enter no.of items to be store in array ");
                    n = sc.nextInt();
                    if (n >= size) {
                        System.out.println("no.item can not be greater or equal to the array ");
                        break;
                    }
                    System.out.println("Enter" + n + "item");
                    for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                    }
                    System.out.println("Array created successfully");
                    break;
                case 2:
                    if (n == 0) {
                        System.out.println("Empty array,first creat an array");
                        break;
                    }
                    System.out.println("Elements of array are:");
                    for (int i = 0; i < n; i++) {
                        System.out.println(a[i] + " ");
                    }
                    System.out.println("Displyed successfully");
                    break;
                case 3:
                    if (n == 0) {
                        System.out.println("Empty array,first creat an array");
                        break;
                    }
                    if (n >= size) {
                        System.out.println("Array is full ");
                        break;
                    }
                    System.out.println("Enter position where you insurt : ");
                    int pos = sc.nextInt();
                    if (pos < 0 || pos >= size) {
                        System.out.println("invalid position");
                        break;
                    }
                    System.out.println("Enter your new item ");
                    int item = sc.nextInt();
                    for (int i = n - 1; i >= pos; i--) {
                        a[i + 1] = a[i];
                    }
                    a[pos] = item;
                    n++;
                    System.out.println("Element in surt successfully ");
                    break;
                case 4:
                    if (n == 0) {
                        System.out.println("Empty array,first creat an array");
                        break;
                    }
                    System.out.println("Enter position: ");
                    pos = sc.nextInt();
                    if (pos < 0 || pos >= n) {
                        System.out.println("invalid position ");
                        break;
                    }
                    for (int i = pos + 1; i < n; i++) {
                        a[i - 1] = a[i];
                    }
                    n--;
                    System.out.println("Elements deleted successfully");
                    break;
                case 0:
                    System.out.println("Exiting the program");
                    return;
                default:
                    System.out.println("invalid input");

            }
            System.out.println("------------------------------------------------------");
        }

    }
}
