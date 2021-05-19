package Homework.day17.ItCompany;

public class Accounting extends ItCompany {
    protected String departmentNAme;

    public String getDepartmentNAme() {
        return departmentNAme;
    }

    public void setDepartmentNAme(String departmentNAme) {
        if (departmentNAme.length() == 0) {
            System.out.println("name cant be nothing, you piece of shit");
            return;
        }
        this.departmentNAme = departmentNAme;
    }
}
