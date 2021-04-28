package Homework.day3;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the Radius.");

        double Radius=sc.nextDouble();
        double PI = 3.14159;

        System.out.println("The area of the circle = " + PI*Radius*Radius);
        System.out.println("The perimeter of the circle = " + 2*PI*Radius);

        sc.close();
    }
}
