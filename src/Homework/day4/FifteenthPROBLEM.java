package Homework.day4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FifteenthPROBLEM {
    public static void main(String[] args)throws InputMismatchException {
        Scanner sc= new Scanner(System.in);
        int max = 0;
        int checkMax = 0;
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter the values");
            for (int i = 0; ; i++) {
                int input = sc.nextInt();
                list.add(input);
            }
        }



//        for(int i = 0; ; i++) {
//            for (Integer integer : list) {//
//                if (list.get(i).equals(integer)) checkMax++;
//            }
//            if (checkMax > max) {
//                max = checkMax;
//                checkMax = 0;
//            }
//        }
//        System.out.println(max);
    }
