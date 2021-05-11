package BootcampClassWork;

public class Matrictask {
    public static void main(String[] args) {
//        matrici tareri mijin
//                arrayi mijin@

    }

    public static int matriciMijinTvabanakan(int[][] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                res += arr[i][j];
            }
        }
        return res / arr[0].length;
    }

    public static int matriciMijinTvabanakan(int[] arr) {//Arrayi mijin tvabanakan@
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        return res / arr.length;
    }
}