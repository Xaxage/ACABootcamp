package Homework.day11;

public class Sixth {
    public static void main(String[] args) {
        fib(5);
    }

    static int fib(int n) {
        int first = 0;
        int second = 1;

        for (int i = 0; i < n - 1; i++) {
            //System.out.println(first);
            int tmp = first;
            first = second;
            second = tmp + first;
        }
        System.out.println(first);
        return 1;
    }
}
