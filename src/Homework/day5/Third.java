package Homework.day5;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number. ");

        int number=sc.nextInt();
        int check=0;
        //check=(number<0) ? -1 : (number==0) ? 0 : 1;
        check= Integer.compare(number, 0);;
        System.out.println(check);
    }
}
