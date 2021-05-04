package Homework.day7;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the range.");

        int start = sc.nextInt();
        int end = sc.nextInt();
        int check=0;

        for (int i = start+1; i < end; i++) {
            if ((i & i - 1) == 0){
                System.out.println(i);
                check++;
            }
        }
        if(check==0) System.out.println(-1);

        sc.close();
    }
}
