package Homework.day12;

public class Tenth {
    public static void main(String[] args) {

    }

    static int reminder(int a) {
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    static int reminder(int a, int reminder) {
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum % reminder;
    }
}
