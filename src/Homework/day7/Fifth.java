package Homework.day7;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number.");

        int number = sc.nextInt();

        for (int i = 0; number != 0; i++) {
            if( number%10==0 && i==0){
                number/=10;
                continue;
            }
            System.out.print(number%10);
            number/=10;
        }

        sc.close();
    }
}
