package Homework.day8;

public class Third {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 3, 4, -2};
        int posNumCounter = 0;
        for (int i = 0; i < arr.length; i++) if (arr[i] >= 0) posNumCounter++;
        System.out.println(posNumCounter);
    }
}
