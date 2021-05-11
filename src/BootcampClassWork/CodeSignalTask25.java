package BootcampClassWork;

import java.util.Arrays;

public class CodeSignalTask25 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1};
        System.out.println(Arrays.toString(arrayReplace(arr, 1, 3)));
    }

    static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == elemToReplace) inputArray[i] = substitutionElem;
        }
        return inputArray;
    }
}
