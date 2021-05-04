package Homework.day6;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Print a number to find out the smallest natural divisor.");

        int number=sc.nextInt();
        int i=2;

        while(true){
            if(number%i==0){
                System.out.println(i);
                break;
            }
            i++;
        }

        sc.close();
    }
}
