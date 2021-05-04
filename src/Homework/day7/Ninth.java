package Homework.day7;

import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers.");
        int i=0;
        int sum=0;

        while(i!=10){
            int input=sc.nextInt();
            sum+=input;
            i++;
        }

        System.out.println(sum);

        sc.close();
    }
}
