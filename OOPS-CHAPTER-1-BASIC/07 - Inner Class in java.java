1️⃣ Member Inner Class (Non-static)
📌 Defined inside a class (not static)
  - non static method (Parent.Child c1 = p1.new Child();)

  -----------------------------------------------------------------------------------

class Parent {
    void fun(){
        System.out.println("Parent Hello");
    }
    
    static int x = 10; // Can access only static members of outer class
    
    class Child {
        void Childfun(){
            System.out.println("Child Hello");
            System.out.println(x); // Can access all members of outer class (even private)
        }
    }
}

class Main {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.fun();
        
        Parent.Child c1 = p1.new Child();
        c1.Childfun();
    }
}

-------------------------------------------------------------------------------------
  
2️⃣ Static Nested Class
📌 Declared with static
  - static method (Parent.Child c1 = new p1.Child();)

  -----------------------------------------------------------------------------------

class Parent {
    void fun(){
        System.out.println("Parent Hello");
    }
    
    static class Child {
        void Childfun(){
            System.out.println("Child Hello");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Parent.Child c1 = new Parent.Child(); // ✅ works now
        c1.Childfun();
    }
}

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
conclusion:
------------------------------------------------------------

  ✅ Non-Static Inner Class
class Outer {
    int x = 10;

    class Inner {
        void show() {
            System.out.println(x); // ✅ works
        }
    }
}

👉 Need outer object:

Outer o = new Outer();
Outer.Inner i = o.new Inner();
✅ Static Inner Class
class Outer {
    static int x = 20;

    static class Inner {
        void show() {
            System.out.println(x); // ✅ only static allowed
        }
    }
}

👉 No outer object needed:

Outer.Inner i = new Outer.Inner();

---------------------------------------------------------
Anonymous Inner Class
  📌 Class without a name (used for one-time use)
---------------------------------------------------------
abstract class Animal {
    abstract void sound();
}

class Test {
    public static void main(String[] args) {
        Animal obj = new Animal() {
            void sound() {
                System.out.println("Dog barks");
            }
        };
        obj.sound();
    }
}


---------------------------------------------------------
Local Inner Class
📌 Defined inside a method
---------------------------------------------------------

class Outer {
    void show() {
        class Inner {
            void display() {
                System.out.println("Inside Local Inner Class");
            }
        }

        Inner obj = new Inner();
        obj.display();
    }
}


-----------------------------------------------------------------------------
🎯 Final Conclusion of Inner Classes in Java
🔹 What is Inner Class?

👉 A class inside another class, used for better encapsulation and logical grouping.
-----------------------------------------------------------------------------
🔥 Types of Inner Classes (Final View)
  -----------------------------------------------------------------------------
1️⃣ Member Inner Class (Non-static)
Depends on outer class object
Can access all members (static + non-static)
Outer o = new Outer();
Outer.Inner i = o.new Inner();
-----------------------------------------------------------------------------
  
2️⃣ Static Nested Class
Independent of outer class
Can access only static members
Outer.Inner i = new Outer.Inner();
-----------------------------------------------------------------------------
  
3️⃣ Local Inner Class
Defined inside a method
Used only within that method
Cannot be accessed outside
  -----------------------------------------------------------------------------

4️⃣ Anonymous Inner Class
No name
Used for one-time implementation
Common in interfaces / abstract classes

-----------------------------------------------------------------------------

