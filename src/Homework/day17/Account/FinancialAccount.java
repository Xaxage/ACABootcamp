package Homework.day17.Account;

public class FinancialAccount extends TaxAccounting {
    @Override
    protected void account() {
        System.out.println(salary);
    }
}
