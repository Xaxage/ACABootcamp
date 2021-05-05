package Homework.day8;

public class Fifteenth {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 12, 2, 3, 3, 3, 4};
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) counter++;
                if (counter > 1) break;
            }

            if (counter < 2) System.out.println(arr[i]);
            counter = 0;
        }
    }
}
