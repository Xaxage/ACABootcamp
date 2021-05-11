package Homework.day11;

public class Eighth {
    public static void main(String[] args) {
        System.out.println(isVowel('r'));
    }

    static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u';
    }
}
