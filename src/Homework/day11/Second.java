package Homework.day11;

public class Second {
    public static void main(String[] args) {
        System.out.println(powerCheck(16.0, 2));
    }

    public static int powerCheck(double a, int n) {
        int result = 0;
        while (a != 0) {
            a /= n;
            result++;
        }

        return result;
    }
}
