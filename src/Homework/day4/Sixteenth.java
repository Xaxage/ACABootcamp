package Homework.day4;

public class Sixteenth {
    public static void main(String[] args) {
        double a = 2;
        double b = 7;
        double c = 1;

        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) throw new IllegalArgumentException();//Checking if it has a solution.
        double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        if (x1 != x2) System.out.println("x1 = " + x1 + "\n" + "x2 = " + x2);
        else System.out.println("x1 = " + x1);
    }
}
