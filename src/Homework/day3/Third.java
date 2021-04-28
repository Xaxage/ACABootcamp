package Homework.day3;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the degree (Fahrenheit)");

        double fahrenheitDegree= sc.nextDouble();
        double celsiusDegree=((fahrenheitDegree-32)*(5.0/9.0));
        System.out.println(celsiusDegree);
        float newFloat=(float)celsiusDegree;
        int newInt=(int)celsiusDegree;
        System.out.println(newInt);

        sc.close();
    }
}
