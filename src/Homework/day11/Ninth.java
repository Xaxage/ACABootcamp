package Homework.day11;

public class Ninth {
    public static void main(String[] args) {
        System.out.println(palindrome(1456541));
    }

    static boolean palindrome(int n) {
        String str = Integer.toString(n);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
        }
        return true;
    }
}
