package Homework.day7;

import java.util.Scanner;

public class Sixteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");

        int size=sc.nextInt();

        /*
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("X");
            }
            System.out.println();
        }

        System.out.println("--------------------");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }*/  // 1 & 2

        /*int counter=0;
        for (int i = 0; i < size; i++) {

            
            for (int j = 0; j < size-i; j++) {
                System.out.print("X");
            }
            System.out.println();
            counter++;
            for (int j = 0; j < counter; j++) {
                System.out.print(" ");
            }
        }*/  // 3

        /*int counter=size;
        for (int i = 0; i < size+1; i++) {
            for (int j = 0; j < counter; j++) {
                System.out.print(" ");
            }

            counter--;

            for (int j = 0; j < i; j++) {
                System.out.print("X");
            }

            System.out.println();
        }*/  // 4
    }
}
