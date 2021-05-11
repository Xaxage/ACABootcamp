package Homework.day11;

public class Thirteenth {
    public static void main(String[] args) {

    }
    public static int search(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==k) return i;
        }
        return -1;
    }
}
