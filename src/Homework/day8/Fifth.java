package Homework.day8;

public class Fifth {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, -1, -2, 3, 4, -2};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= 0 && arr[i + 1] >= 0) {
                System.out.println(arr[i] + " " + arr[i + 1]);
                break;
            } else if (arr[i] < 0 && arr[i + 1] < 0) {
                System.out.println(arr[i] + " " + arr[i + 1]);
                break;
            }
        }
    }
}
