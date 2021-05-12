package Homework.day13;

import java.util.Arrays;

public class Fifth {
    public static void main(String[] args) {
        System.out.println(reverse("abcd"));
    }

    static String reverse(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length() / 2; i++) {
            char tmp = 'a';
            tmp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = tmp;
        }
        return Arrays.toString(chars);
    }
}
