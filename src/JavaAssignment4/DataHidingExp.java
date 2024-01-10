package JavaAssignment4;

//Encapsulation and Abstraction: Student class with data hiding
class Student1 {
 private String name;
 private int age;
 private double gpa;

 public Student1(String name, int age, double gpa) {
     this.name = name;
     this.age = age;
     this.gpa = gpa;
 }

 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 public double getGpa() {
     return gpa;
 }

 public void displayInfo() {
	 System.out.println("Info using public methods");
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("GPA: " + gpa);
 }
}

//Main class to demonstrate the simple example
public class DataHidingExp {
 public static void main(String[] args) {
     // Creating an instance of the Student class
     Student1 student1 = new Student1("Shravya", 22, 8.5);

     // Accessing information through public methods
     System.out.println("Student Information:");
     System.out.println("Name: " + student1.getName());
     System.out.println("Age: " + student1.getAge());
     System.out.println("GPA: " + student1.getGpa());

     // Displaying information using a public method
     student1.displayInfo();
 }
}
