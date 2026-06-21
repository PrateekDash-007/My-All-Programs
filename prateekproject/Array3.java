package prateekproject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int a[] = null;
        int size = 0;
        while (true) {
            System.out.println("Welcome to Array class" + "\n" + "press 1 for creating an array" + "\n" + "press 2 for display your array" + "\n" + "press 3 for insert element in your array " + "\n" + "press 4 for deleting the element in your array" + "\n" + "press 0 for exit");
            int c;
            try {
                c = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid integer");
                sc.next();
                continue;
            }

            switch (c) {
                case 1:
                    if (n > 0) {
                        System.out.println("Array is already created, try inserting and deleting in array");
                        break;
                    }

                    System.out.println("Enter maximum size of your array");
                    try {
                        size = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Please enter a valid integer for size");
                        sc.next();
                        break;
                    }
                    if (size <= 0) {
                        System.out.println("Error: Array size must be positive");
                        size = 0;
                        break;
                    }
                    a = new int[size];
                    System.out.println("Enter no. of items to be stored in array");
                    try {
                        n = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Please enter a valid integer for item count");
                        sc.next();
                        a = null;
                        size = 0;
                        break;
                    }
                    if (n >= size) {
                        System.out.println("no. of items can not be greater or equal to the array size");
                        n = 0;
                        a = null;
                        size = 0;
                        break;
                    }
                    if (n < 0) {
                        System.out.println("Error: Number of items cannot be negative");
                        n = 0;
                        a = null;
                        size = 0;
                        break;
                    }
                    System.out.println("Enter " + n + " items");
                    try {
                        for (int i = 0; i < n; i++) {
                            a[i] = sc.nextInt();
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Please enter valid integers for array elements");
                        sc.next();
                        n = 0;
                        a = null;
                        size = 0;
                        break;
                    }
                    System.out.println("Array created successfully");
                    break;
                case 2:
                    if (n == 0) {
                        System.out.println("Empty array, first create an array");
                        break;
                    }
                    System.out.println("Elements of array are:");
                    for (int i = 0; i < n; i++) {
                        System.out.println(a[i] + " ");
                    }
                    System.out.println("Displayed successfully");
                    break;
                case 3:
                    if (n == 0) {
                        System.out.println("Empty array, first create an array");
                        break;
                    }
                    if (n >= size) {
                        System.out.println("Array is full");
                        break;
                    }
                    System.out.println("Enter position where you want to insert:");
                    int pos;
                    try {
                        pos = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Please enter a valid integer for position");
                        sc.next();
                        break;
                    }
                    if (pos < 0 || pos >= size) {
                        System.out.println("Invalid position");
                        break;
                    }
                    System.out.println("Enter your new item");
                    int item;
                    try {
                        item = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Please enter a valid integer for the item");
                        sc.next();
                        break;
                    }
                    for (int i = n - 1; i >= pos; i--) {
                        a[i + 1] = a[i];
                    }
                    a[pos] = item;
                    n++;
                    System.out.println("Element inserted successfully");
                    break;
                case 4:
                    if (n == 0) {
                        System.out.println("Empty array, first create an array");
                        break;
                    }
                    System.out.println("Enter position:");
                    try {
                        pos = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Please enter a valid integer for position");
                        sc.next();
                        break;
                    }
                    if (pos < 0 || pos >= n) {
                        System.out.println("Invalid position");
                        break;
                    }
                    for (int i = pos + 1; i < n; i++) {
                        a[i - 1] = a[i];
                    }
                    n--;
                    System.out.println("Element deleted successfully");
                    break;
                case 0:
                    System.out.println("Exiting the program");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid input");
            }
            System.out.println("------------------------------------------------------");
        }
    }
}
