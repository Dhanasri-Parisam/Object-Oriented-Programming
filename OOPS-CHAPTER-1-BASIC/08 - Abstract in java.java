-------------------------------------------------------------------------------------------------
  🧠 What is Abstract in Java?

👉 Abstraction = Hiding implementation details, showing only essential features

Real-life example:

You use a mobile 📱
You don’t know how circuits work internally
You just know what it does
-------------------------------------------------------------------------------------------------
- Example of Abstract class with empty body
-------------------------------------------------------------------------------------------------
  
class Animal {
    void talk(){
        
    }
    
    void eating(){
        System.out.println("Dog is eating drools");
    }
}

class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eating();
    }
}

-------------------------------------------------------------------------------------------------
👉 talk() method:

It has no body content
But it's still a normal method, NOT abstract

👉 eating() method:

Prints a message
-------------------------------------------------------------------------------------------------

-------------------------------------------------------------------------------------------------
- Abstract methods
- Normal methods
Rules:
Must be inside abstract class
Must be implemented in child class
-------------------------------------------------------------------------------------------------
  
abstract class Animal {
    abstract public void talk();
    
    void eating(){
        System.out.println("Dog is eating drools");
    }
}

class B extends Animal{
    public void talk() {
        System.out.println("Dog taking");
    }
}

class Main {
    public static void main(String[] args) {
        B b1 = new B();
        b1.talk();
        b1.eating();
    }
}

✅ Key Points:
Cannot create object ❌
Can have:
Abstract methods
Normal methods
Used as a base class
-------------------------------------------------------------------------------------------------

-------------------------------------------------------------------------------------------------
  🔥 Abstract + Anonymous Class

Normally:

Abstract class ❌ cannot be instantiated
But using anonymous class → ✅ we can create object + implementation at same time
✅ Basic Example
-------------------------------------------------------------------------------------------------
abstract class Animal {
    abstract void sound();
}
// 🔹 Anonymous Implementation:
class Main {
    public static void main(String[] args) {

        Animal a = new Animal() {
            void sound() {
                System.out.println("Dog is barking");
            }
        };

        a.sound();
    }
}


🟢 Output:
Dog is barking
-------------------------------------------------------------------------------------------------

-------------------------------------------------------------------------------------------------
  // some of the important things about this abstract class 

  // 1. Abstract Class Cannot Be Instantiated (explicit example)
  abstract class Animal {
    abstract void talk();
}

class Main {
    public static void main(String[] args) {
        Animal a = new Animal(); // ❌ ERROR
    }
}



// 2. Constructor in Abstract Class ✅ (Most students miss this)
abstract class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog constructor");
    }
}

👉 Yes, abstract classes CAN have constructors

// 3. Partial Abstraction (Very Important Concept)
  abstract class Animal {
    abstract void sound(); // abstract

    void eat() {           // concrete
        System.out.println("Eating...");
    }
}

//4. Child Class Rule (CRITICAL)

👉 If child class does NOT implement abstract method:

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {  // ❌ ERROR if no implementation
}

👉 Fix:

abstract class Dog extends Animal {
}

//5. Abstract vs Method Overriding Link 🔥 
abstract class Animal {
  abstract void sound(); 
}
class Dog extends Animal {
  void sound() {
    System.out.println("Bark"); 
} }

class Main {
    public static void main(String[] args) {
        Animal a = new Dog();  // polymorphism
        a.sound();
    }
}
-------------------------------------------------------------------------------------------------
