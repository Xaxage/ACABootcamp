package Homework.day4;

import java.util.Random;

public class Tenth {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt();
        boolean check = (num > -1000 && num < 1000) && (num % 3 == 0 || num % 5 == 0);

        System.out.println(num + "  " + check);
    }
}
