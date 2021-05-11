package Homework.day11;

public class Tenth {
    public static void main(String[] args) {
        System.out.println(hasEight(194));
    }

    public static boolean hasEight(int number) {
        while (number != 0) {
            if (number % 10 == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
