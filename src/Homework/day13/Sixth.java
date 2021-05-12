package Homework.day13;

import java.util.Locale;

public class Sixth {
    public static void main(String[] args) {
        countVowels("testing12345");
    }

    static void countVowels(String str) {
        int vowelCounter = 0;
        int numberCounter = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowelCounter++;
            if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4'
                    || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9') numberCounter++;
        }
        System.out.println("Number of vowels is " + vowelCounter + "(" + ((double) (vowelCounter) / str.length() * 100) + " %)");
        System.out.println("Number of digits is " + numberCounter + "(" + ((double) (numberCounter) / str.length() * 100) + " %)");
    }
}
