package Homework.day13;

public class Ninth {
    public static void main(String[] args) {
        System.out.println(ifBinary("00011"));
    }

    static boolean ifBinary(String str) {
        char[] chars = str.toCharArray();
        if (chars.length % 4 != 0 || chars.length < 4) return false;
        for (char ch : chars) if (ch != '0' && ch != '1') return false;
        return true;
    }
}
