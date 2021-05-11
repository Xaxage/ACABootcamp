package Homework.day12;

public class Second {
    public static void main(String[] args) {
        double a = addInt(2.3);
    }

    static float addInt(double a) {
        System.out.println(a);
        return (float) a;
    }

    static int addInt(int b) {
        System.out.println(b);
        return b;
    }
}
