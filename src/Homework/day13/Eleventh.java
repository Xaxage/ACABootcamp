package Homework.day13;

public class Eleventh {
    public static void main(String[] args) {
        bin2Dec("1010");
    }

    static void bin2Dec(String str) {
        int decimal = Integer.parseInt(str, 2);
        System.out.println(decimal);
    }
}
