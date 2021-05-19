package Homework.day17.Animal;

public class Dog extends Animal {
    @Override
    protected void voice() {
        System.out.println("Overrided Hello motherfucker");
    }

    @Override
    protected void eat() {
        System.out.println("Overrided I am eating.");
    }
}
