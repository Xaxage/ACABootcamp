package Homework.day13;

public class Fourth {
    static int countVowels(String str, char ch1) {
        int counter = 0;
        for (char ch2 : str.toCharArray()) if (ch2 == ch1) counter++;
        return counter;
    }

    static int countVowels(char ch1, String str) {
        return Math.abs(countVowels(str, ch1) - str.length());
    }
}