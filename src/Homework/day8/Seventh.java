package Homework.day8;

public class Seventh {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, 100, -2, -5, 2, 23, 47};
        int minPos = 1000;
        for (int j : arr) if (j < minPos && j > 0) minPos = j;
        System.out.println(minPos);
    }
}
