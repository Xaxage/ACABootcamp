package Homework.day11;

public class Seventh {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    static int factorial(int n) {
        int sum = 1;
        for (int i = 1; i < n + 1; i++) {
            sum *= i;
        }
        return sum;
    }
}
