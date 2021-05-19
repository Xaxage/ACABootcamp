package Homework.day17.ItCompany;

public class TaxAccounting extends Accounting {
    @Override
    protected int account() {
        System.out.print("Face the reality");
        return balance - balance * 2;
    }
}
