package Homework.day11;

public class Twelfth {
    public static void main(String[] args) {

    }

    static  boolean contains(int[] arr,int k){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==k) return true;
        }
        return false;
    }
}
