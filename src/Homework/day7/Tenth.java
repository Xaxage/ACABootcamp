package Homework.day7;

import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary Number");

            String binary = sc.nextLine();

            System.out.println("Decimal Number : "+Integer.parseInt(binary,2));

            sc.close();
        }
    }

