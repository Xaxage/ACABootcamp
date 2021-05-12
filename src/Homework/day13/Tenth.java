package Homework.day13;


public class Tenth {
    public static void main(String[] args) {
        System.out.println(checkIfHex("123abcX"));
    }

    static boolean checkIfHex(String str) {
        str = str.toLowerCase();
        char[] chars = str.toCharArray();

        for (char ch : chars) {
            if (((int) ch < 48 || (int) ch > 57) && ((int) ch < 97 || (int) ch > 103)) return false;
        }
        return true;
    }
}
