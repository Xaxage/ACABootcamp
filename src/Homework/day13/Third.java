package Homework.day13;

public class Third {
    static boolean contains(String str, char ch1) {
        for(char ch2 : str.toCharArray()){
            if(ch2==ch1) return true;
        }
        return false;
    }
}
