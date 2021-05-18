package Homework.day13;

import java.util.Arrays;

public class Seventh {
    public static void main(String[] args) {
//        char ch = 'a';
//        System.out.println((int)'a');
//        int i=97;
//        System.out.println((char)i);
        System.out.println(caesarSUCKS("AXZ", 2));
    }

    static String caesarSUCKS(String str, int n) {
        char[] chars = (str.toUpperCase()).toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int asci = (int) (chars[i]);
            if (asci + n > 90) {
                chars[i] = (char) (65+asci+n-91);
                System.out.println( 65+asci+n-91);
                continue;
            }
            chars[i] = (char) (asci + n);
        }


        return Arrays.toString(chars);
    }


}
