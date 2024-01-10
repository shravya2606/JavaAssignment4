package JavaAssignment4;
public class staticExample {
    static int staticVariable = 10;
    int instanceVariable;
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {

        System.out.println("Static Variable: " + staticExample.staticVariable);

        // Accessing static method
        staticExample.staticMethod();

        // Creating an instance of the class
        staticExample ob = new staticExample();

        // Accessing instance variable
        ob.instanceVariable = 5;
        System.out.println("Instance Variable: " + ob.instanceVariable);

        // Accessing instance method
        ob.instanceMethod();
    }
}
