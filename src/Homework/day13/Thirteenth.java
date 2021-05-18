package Homework.day13;

public class Thirteenth {
    public static void main(String[] args) {
        System.out.println(firstNonRepeated("12342341"));

    }

    static char firstNonRepeated(String str) {
        char[] chars = str.toCharArray();
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j]) counter++;
            }
            if (counter == 1) {
                return chars[i];
            }
            counter = 0;
        }
        return '-';
    }
}
