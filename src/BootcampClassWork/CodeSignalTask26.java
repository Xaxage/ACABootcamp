package BootcampClassWork;

public class CodeSignalTask26 {
    public static void main(String[] args) {
        char a = '2';
        int i = (char) a;
        System.out.println(i);
        boolean b=variableName("ыtrs");
        System.out.println(b);
    }

    static boolean variableName(String names) {
        char ch1 = names.charAt(0);
        int i=(char)ch1;
        if(i>=48 && i<=57) return false;


        for(char ch2 : names.toCharArray()){
             ch1 = ch2;
             i=(char)ch1;
             if(i==95) continue;
            if(!(i>=32 && i<=127)) return false;
        }

        return true;
    }
}