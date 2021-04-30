package Homework.day4;

import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a and b .");

        int a=scanner.nextInt();
        int b=scanner.nextInt();

        if(a>10 && b!=10) System.out.println("They are legal.");
        else System.out.println("They are illegal.");

        if(a>0 && b>0) System.out.println("They are legal.");
        else System.out.println("They are illegal.");

        if(a<0 && b<0) System.out.println("They are legal.");
        else System.out.println("They are illegal.");

        if(a>10 && b<1 && a%2!=0 && b%2!=0) System.out.println("They are legal.");
        else System.out.println("They are illegal.");

        if(a%5==0 && b%5==0) System.out.println("They are legal.");
        else System.out.println("They are illegal.");

        if(a%5!=0 && b%5==0) System.out.println("They are legal.");
        else System.out.println("They are illegal.");
    }
}
