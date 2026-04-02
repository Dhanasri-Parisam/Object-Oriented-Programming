/* Method overloading : 
Definition : Method overloading is a feature in Java where a class can have more than one method with the same name, provided their parameter list is different (in number, type, or order).
It improves code readability and flexibility.

## Rules for Method Overloading

To use the same function name:

- ✅ Parameters must differ in:
    - `Number of parameters (same as passing)`
    - `OR type of parameters`
    - `OR order of parameters (int, string, float)`
- ❌ Return type alone is NOT enough

*/

class Example {
    
    void display() {
        System.out.println("No parameters");
    }

    void display(int a) {
        System.out.println("One integer: " + a);
    }

    void display(int a, int b) {
        System.out.println("Two integers: " + (a + b));
    }
}

/*
## **Method Overriding**

**Method Overriding** happens when a **child class provides its own implementation of a method that is already defined in the parent class**.

👉 It is an example of **runtime polymorphism**.

`@Override` is used in a subclass to indicate that a method is overriding a method from its superclass. It helps the compiler **check correctness** and avoids mistakes.
*/

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();   // Animal version

        Dog d = new Dog();
        d.sound();   // Dog version

        Animal obj = new Dog();
        obj.sound(); // Runtime polymorphism → Dog version
    }
}

