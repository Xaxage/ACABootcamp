package Homework.day8;

public class Fourth {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 2, 3, 4, -2};

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i+1] > arr[i]) System.out.println(arr[i+1]);
        }
    }
}
