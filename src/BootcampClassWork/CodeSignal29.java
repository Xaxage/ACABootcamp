package BootcampClassWork;

public class CodeSignal29 {
    public static void main(String[] args) {
            String str = "B2";
            chek(str);
        }

        static void chek(String str){
            int colorCheck=0;//White - 1 , Black - 2
            int letterCheck=0;//A C E G - 1,

            if(str.charAt(0)=='A' || str.charAt(0)=='C' || str.charAt(0)=='E' || str.charAt(0)=='G'){
                letterCheck=1;
            }else letterCheck=2;

            if(letterCheck==1 && (str.charAt(1)%2)!=0 || letterCheck==2 && str.charAt(1)%2==0){
                colorCheck=2;
            }else colorCheck=1;

        }
    }



