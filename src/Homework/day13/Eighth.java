package Homework.day13;

public class Eighth {
    public static void main(String[] args) {
        System.out.println(palindromeCheck("acca"));
    }

    static boolean palindromeCheck(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) return false;
        }
        return true;
    }
}
