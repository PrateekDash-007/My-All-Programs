package prateekproject;

import java.util.Scanner;

public class Person {
    int age;
    String name;

    public void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        age = sc.nextInt();
        System.out.println("Enter your name");
        name = sc.nextLine();
    }

    public void displayData() {
        System.out.println("name is " + name + " and age is " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.age = 24;
        p1.name = "Rohan";
        p2.setData();
        p1.displayData();
        p2.displayData();
        if (p1.age < p2.age) {
            System.out.println(p1.name + " is younger");
        } else {
            System.out.println(p2.name + " is younger");
        }
    }
}
