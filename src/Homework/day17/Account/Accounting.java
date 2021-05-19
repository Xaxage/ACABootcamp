package Homework.day17.Account;

public class Accounting {
    private int countOfEmployees;
    private String departmentName;
    protected int salary = 10000;

    protected void account() {
        System.out.println("I called account method.");
    }


    private String accountDepartmentName() {
        return this.departmentName;
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

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
