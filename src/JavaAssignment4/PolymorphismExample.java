package JavaAssignment4;
class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}
class Dog extends Animal {
    // Overriding the makeSound method in the base class
    @Override
    public void makeSound(){
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    // Overriding the makeSound method in the base class
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Creating instances of different subclasses
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        animal1.makeSound(); // Calls the makeSound method of Dog class
        animal2.makeSound(); // Calls the makeSound method of Cat class
    }
}

