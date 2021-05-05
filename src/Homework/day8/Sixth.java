package Homework.day8;

public class Sixth {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, 100, -2, -5, -2,23,47};
        int maxNum = arr[0];
        int indexOfMax = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                indexOfMax = i;
            }
        }
        System.out.println("Index of max element is " + indexOfMax + "\n" + "Max element is " + maxNum);
    }
}
