// EncapsulationExample.java
package JavaAssignment4;
// The class with encapsulation
class Student {
    private String name;
    private int age;
    private double gpa;
    
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Public getter methods to access private fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    // Public setter methods to modify private fields
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Public method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
}

// Main class to demonstrate encapsulation
public class EncapsulationExp {
    public static void main(String[] args) {
        // Creating an instance of the Student class
        Student student1 = new Student("Shravya", 22, 8.5);

        // Displaying the initial information
        System.out.println("Initial Information:");
        student1.displayInfo();

        // Modifying the information using setter methods
        student1.setName("Manu");
        student1.setAge(22);
        student1.setGpa(7.8);

        // Displaying the modified information
        System.out.println("\nModified Information:");
        student1.displayInfo();
    }
}

