package Homework.day6;

public class Tenth {
    public static void main(String[] args) {
        //32
        int i = 32;
        int counter=0;
        while (i != 122) {
            System.out.print((char) i);
            i++;
            counter++;
            if(counter==10){
                System.out.println();
                counter=0;
            }
        }
    }
}
