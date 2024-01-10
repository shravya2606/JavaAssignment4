
package JavaAssignment4;
class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }
}
public class OverloadingExample 
{
    public static void main(String[] args) {
        
        MathOperations mathOps = new MathOperations();

        int result1 = mathOps.add(5, 10);
        int result2 = mathOps.add(3, 7, 12);
        double result3 = mathOps.add(2.5, 3.5);
        String result4 = mathOps.add("Hello, ", "world!");

        // Displaying the results
        System.out.println("Result 1 " + result1);
        System.out.println("Result 2" + result2 );
        System.out.println("Result 3" + result3 );
        System.out.println("Result 4" + result4 );
}
}