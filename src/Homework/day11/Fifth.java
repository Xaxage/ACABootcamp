package Homework.day11;

public class Fifth {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }

   public static boolean isPrime(int n){
        int counter=0;
       for (int i = 2; i < n; i++) {
           if(n%i==0) counter++;
           if(counter>0) return false;
       }
       return true;
   }
}
