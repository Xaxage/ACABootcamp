package BootcampClassWork;

public class DistanceOverloading {
    public static void main(String[] args) {
        System.out.println(calculateDistance(3, 4));
        System.out.println(calculateDistance(0,0,3,4));
    }

    static double calculateDistance(double x, double y) {
        double result = 0;
        return Math.sqrt(x * x + y * y);
    }

    static double calculateDistance(double x1, double y1, double x2, double y2) {
        double result = 0;
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
