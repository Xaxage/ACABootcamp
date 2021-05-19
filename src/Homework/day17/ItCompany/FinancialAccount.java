package Homework.day17.ItCompany;

public class FinancialAccount extends TaxAccounting {
    @Override
    protected int account() {
        System.out.println("Раб ссаный.");
        return this.balance - (this.balance * 90) / 100;
    }
    
}
