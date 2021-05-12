package BootcampClassWork;

public class CodeSignal31 {
    public static void main(String[] args) {
        System.out.println(depositProfit(100,20,170));
    }

    public static int depositProfit(int deposit, int rate, int threshold) {
        double current=deposit;
        int months=0;
        double percent=rate/100.0;
        while(current<threshold){
            current+=current*percent;
            months++;
        }
        return months;
    }

}
