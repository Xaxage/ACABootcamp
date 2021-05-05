package Homework.day8;

public class Seventeenth {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i] > arr[i+1]) {
                System.out.println("It isn't.");
                break;
            }
        }
    }
}
