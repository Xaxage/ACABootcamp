package Homework.day7;

import java.util.Scanner;

public class Twelfth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number.");

        int num=sc.nextInt();
        int counter=0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(i);
                counter++;
                if(counter==num) break;
            }
            if(counter==num) break;
        }
        sc.close();
    }
}
