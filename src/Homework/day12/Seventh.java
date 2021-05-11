package Homework.day12;

public class Seventh {
    public static void main(String[] args) {

    }

    static int max(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    static int max(int a, int b, int c) {
        int max = a;
        if (max > b) max = b;
        if (max > c) max = c;
        return max;
    }

    static int max(int a, int b, int c, int d) {
        int max = a;
        if (max > b) max = b;
        if (max > c) max = c;
        if (max > d) max = d;
        return max;
    }
}
