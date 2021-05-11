package BootcampClassWork;

import java.util.Arrays;

public class MatricaiSYUN {
    public static void main(String[] args) {
        int[][] anun = new int[][]{{1,4}, {1,3}};
        System.out.println(Arrays.toString(bacasakan(anun)));
    }

    static int[] bacasakan(int[] arr) {
        for (int i = 0; i < arr.length; i++) arr[i] *= -1;
        return arr;
    }

    static int[] bacasakan(int[][] matrix) {
        int[] arr = new int[matrix.length];
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum+=matrix[j][i];
            }
            arr[i]+=sum;
            sum=0;
        }
        return arr;
    }
}
