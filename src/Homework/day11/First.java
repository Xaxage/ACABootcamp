package Homework.day11;

public class First {
    public static void main(String[] args) {
        System.out.println(min(1,-2,-1));
    }

    public static int min(int a, int b, int c) {
        int min=a;
        if(min>b) min=b;
        if(min>c) min=c;
        return min;
    }
}

