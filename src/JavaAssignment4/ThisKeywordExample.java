package JavaAssignment4;
class Person {
 private String name;
 private int age;

 
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }
 public void setDetails(String name, int age) {
     this.name = name;
     this.age = age;
 }
 public void displayDetails() {
     System.out.println("Name: " + this.name);
     System.out.println("Age: " + this.age);
 }
}

//Main class to demonstrate the use of the 'this' keyword
public class ThisKeywordExample {
 public static void main(String[] args) {
     // Creating an instance of the Person class
     Person person = new Person("Shravya", 22);

     // Displaying details using the displayDetails method
     System.out.println("Details before modification:");
     person.displayDetails();

     // Modifying details using the setDetails method
     person.setDetails("Shreya", 21);

     // Displaying details again
     System.out.println("\nDetails after modification:");
     person.displayDetails();
 }
}
