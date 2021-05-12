package Homework.day13;

public class Fourteenth {
    public static void main(String[] args) {
        System.out.println(howManyTimes("1122331", '1'));
    }

    static int howManyTimes(String str, char ch) {
        char[] arr = str.toCharArray();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) counter++;
        }
        return counter;
    }
}
