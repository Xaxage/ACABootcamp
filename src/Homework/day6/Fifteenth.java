package Homework.day6;

import java.util.Arrays;
import java.util.Scanner;

public class Fifteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number.");

        // int input = sc.nextInt();

       /* int max = 0;
        int num = sc.nextInt();
        int numEx = num;

        while (numEx != 0) {//Finding the max element
            if (numEx % 10 > max)  max = numEx % 10;
            numEx /= 10;
        }

        int secondMax = 0;

        while (num != 0) {
            if (num % 10 > secondMax && num % 10 != max) secondMax = num % 10;
            num /= 10;
        }

        System.out.println(secondMax);*/ //With 2 loops

//        int firstMax = 0;
//        int secondMax = 0;
//
//        while (input != 0) {
//            if (input % 10 > firstMax) {
//            secondMax=firstMax;
//                firstMax = input % 10;
//            }
//            input /= 10;
//        }
//        System.out.println("First is " + firstMax);
//        System.out.println("Second is " + secondMax);


        int a = 18907;
        String s = Integer.toString(a);
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        int i = 0;
        while (i != s.length()) {
            if (chars[s.length() - 1 - i] != chars[s.length() - 2 - i]) {
                System.out.println(chars[s.length() - 2 - i]);
                break;
            }
            i++;
        }

        //sc.close();
    }
}
