package Homework.day5;

import java.util.Scanner;

public class Fourteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 numbers(Scores) .");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average= (a+b+c)/3;

        switch (average/20){
            case 2 -> System.out.println("C");
            case 3 -> System.out.println("B");
            case 4,5-> System.out.println("A");
            default -> System.out.println("F");
        }

        sc.close();
    }
}
