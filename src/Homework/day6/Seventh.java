package Homework.day6;

import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the number to descend from.");

        int input=sc.nextInt();
        while (input--!=0) if(input%2==0) System.out.println(input);

        sc.close();
    }
}
