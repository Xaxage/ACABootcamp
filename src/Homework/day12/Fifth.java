package Homework.day12;

public class Fifth {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

    }

    static int search(int[] arr){ //sizeOfArray
        return arr.length;
    }

    static int search(int[] arr, int element){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element) System.out.println(i);
        }
        return -1;
    }

    static boolean search(int[] arr,int argument, int index){
        return arr[index] == argument;
    }
}
