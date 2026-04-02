
interface Student1 {
    
    default void fun(){
        System.out.println("Hello");   
    }
}

interface Student2 extends Student1{
    
    default void fun(){
        System.out.println("Hii");
    }
}

class Teacher implements Student1, Student2 {
    
    public void fun(){
        System.out.println("Teacher method");
    }

    public void showAll(){
        Student2.super.fun(); // Hii
        new Student1(){}.fun(); // Hello
        fun(); // Teacher
    }
}


class Main {
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        t1.showAll();
        
        
    }
}

--------------------------------------------

call :
Teacher t1 = new Teacher();
t1.showAll();

--------------------------------------------
# 📌 Important Rules of Interface

- All methods are **public + abstract** (by default)
- Variables are **public static final** (constants)
- Use `implements` (not `extends`)
- Cannot create object ❌
- Supports **multiple inheritance** ✅
- A class must implement **all methods** of interface
