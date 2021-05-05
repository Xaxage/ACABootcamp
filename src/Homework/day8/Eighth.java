package Homework.day8;

public class Eighth {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 3, 3, 3};
        int counter=1;
        for (int i = 0; i < arr.length-1; i++) if(arr[i]!=arr[i+1]) counter++;
        System.out.println(counter);
    }
}
