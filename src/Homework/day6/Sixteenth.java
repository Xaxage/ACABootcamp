package Homework.day6;

import java.util.Random;
import java.util.Scanner;

public class Sixteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int rand=random.nextInt();
        while (true){
            int input=sc.nextInt();
            if(input>rand) System.out.println("It's too much.");
            else if(input<rand) System.out.println("It's not enough.");
            else {
                System.out.println("You got it.");
                break;
            }
        }
    }
}
