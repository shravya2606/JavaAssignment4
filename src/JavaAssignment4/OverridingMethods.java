package JavaAssignment4;


class Animal1 {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}
class Dog1 extends Animal1 {
    // Overriding the makeSound method in the base class
    @Override
    public void makeSound(){
        System.out.println("Woof! Woof!");
    }
}

class Cat1 extends Animal1 {
    // Overriding the makeSound method in the base class
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class OverridingMethods {
    public static void main(String[] args) {
        // Creating instances of different subclasses
        Animal1 animal1 = new Dog1();
        Animal1 animal2 = new Cat1();
        animal1.makeSound(); // Calls the makeSound method of Dog class
        animal2.makeSound(); // Calls the makeSound method of Cat class
    }
}

