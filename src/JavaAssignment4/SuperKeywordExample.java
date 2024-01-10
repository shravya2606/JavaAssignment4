
package JavaAssignment4;
class Animal2 {
    private String species;

    // Constructor of the superclass
    public Animal2(String species) {
        this.species = species;
    }
    public void displaySpecies() {
        System.out.println("Species: " + species);
    }
}
class Dog2 extends Animal2 {
    private String breed;

    public Dog2(String species, String breed) {
        super(species);
        this.breed = breed;
    }

    public void displayBreed() {
        System.out.println("Breed: " + breed);
    }

    // Overriding a method in the superclass
    @Override
    public void displaySpecies() {
        // Calling the method of the superclass using super
        super.displaySpecies();
        System.out.println("This is a dog.");
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        // Creating an instance of the subclass (Dog)
        Dog2 myDog = new Dog2("Canine", "Labrador");

        // Calling methods of the subclass
        myDog.displaySpecies();
        myDog.displayBreed();
    }
}
