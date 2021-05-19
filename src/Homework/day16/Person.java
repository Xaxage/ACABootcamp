package Homework.day16;

public class Person {
    private String firstName;
    private String lastName;
    private String id;
    private int age;
    private String nationality;
    private String sex;

    public void show() {
        System.out.println("First name is " + firstName + "\n" + " Last name is " + lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() > 3 && firstName.length() < 15) this.firstName = firstName;
        else System.out.println("Error");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 6 && lastName.length() < 20) this.lastName = lastName;
        else System.out.println("Error");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.charAt(0) != 'A' || id.charAt(1) != 'N' || id.length() > 8) {
            System.out.println("Error");
            return;
        }
        for (int i = 2; i < id.length(); i++) {
            if (!(Character.isDigit(id.charAt(i)) || (int) id.charAt(i) <= 0)) {
                System.out.println("Error");
                return;
            }
        }
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18 && age < 99) this.age = age;
        else System.out.println("Error");

    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (("Female".compareToIgnoreCase(sex) == 0)) this.sex = sex;
        else if (("Male".compareToIgnoreCase(sex) == 0)) this.sex = sex;
        else System.out.println("Error");
    }

    public Person() {

    }


    public Person(String firstName, String name, String id, int age, String nationality, String sex) {
        this.firstName = firstName;
        this.lastName = name;
        this.id = id;
        this.age = age;
        this.nationality = nationality;
        this.sex = sex;
    }
}
