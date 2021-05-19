package Homework.day17.ItCompany;

public class ItCompany {
    protected int countOfEmployees;
    private String CompanyName;
    protected int balance;

    protected int account() {
        return balance;
    }


    public int getCountOfEmployees() {
        return countOfEmployees;
    }

    public void setCountOfEmployees(int countOfEmployees) {
        if (countOfEmployees < 0) {
            System.out.println("Can't be negative numbers of employees.");
            return;
        }
        this.countOfEmployees = countOfEmployees;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
