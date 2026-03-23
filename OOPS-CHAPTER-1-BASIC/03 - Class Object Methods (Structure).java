// ============================================================
// CLASS, OBJECT, AND METHOD NOTES (JAVA) - 150 LINE VERSION
// Topic: Coffee branch example using simple OOP structure.
// ============================================================

// Step 1: Create a class.
// A class is a blueprint for objects.
// It groups data (variables) and behavior (methods).
// Syntax:
// class ClassName {
//     // variables
//     // methods
// }

// In this example, Coffee is the class name.
class Coffee {

    // Step 2: Variables (data members / fields).
    // These fields hold the state of each object.
    String branchName;
    int cupSold;
    int pricePerCup;

    // Optional helper method to calculate revenue.
    int revenue() {
        return cupSold * pricePerCup;
    }

    // Step 3: Method inside class.
    // A method defines behavior for Coffee objects.
    void display() {
        System.out.println("Branch Name : " + branchName);
        System.out.println("Cup Sold    : " + cupSold);
        System.out.println("Price/Cup   : " + pricePerCup);
        System.out.println("Revenue     : " + revenue());
        System.out.println();
    }
}

// Step 4: Main class.
// Java execution starts from main().
class ClassObjectMethodsStructureDemo {

    public static void main(String[] args) {

        // Step 5: Create object 1.
        // Syntax: ClassName objectName = new ClassName();
        Coffee branch1 = new Coffee();

        // Step 6: Assign values to object 1.
        branch1.branchName = "Allu";
        branch1.cupSold = 10;
        branch1.pricePerCup = 20;

        // Step 7: Create object 2.
        Coffee branch2 = new Coffee();

        // Step 8: Assign values to object 2.
        branch2.branchName = "MB";
        branch2.cupSold = 20;
        branch2.pricePerCup = 30;

        // Step 9: Create object 3.
        Coffee branch3 = new Coffee();

        // Step 10: Assign values to object 3.
        branch3.branchName = "NAG";
        branch3.cupSold = 30;
        branch3.pricePerCup = 25;

        // Step 11: Call method using object reference.
        // objectName.methodName();
        branch1.display();
        branch2.display();
        branch3.display();

        // Step 12: Quick comparison note.
        // Procedural style:
        // - Data is separate from functions.
        // OOP style:
        // - Data and methods are inside the class.

        // Step 13: Printing a compact summary.
        System.out.println("Summary Table");
        System.out.println("------------------------------");
        printLine(branch1);
        printLine(branch2);
        printLine(branch3);
        System.out.println("------------------------------");

        // Step 14: Basic total calculation.
        int totalCups = branch1.cupSold + branch2.cupSold + branch3.cupSold;
        int totalRevenue = branch1.revenue() + branch2.revenue() + branch3.revenue();

        // Step 15: Final output.
        System.out.println("Total Cups Sold : " + totalCups);
        System.out.println("Total Revenue   : " + totalRevenue);
    }

    // Utility method in main class.
    // Accepts a Coffee object and prints one formatted line.
    static void printLine(Coffee branch) {
        System.out.println(
            branch.branchName + " | cups=" + branch.cupSold
            + " | price=" + branch.pricePerCup
            + " | revenue=" + branch.revenue()
        );
    }
}

// ---------------------- QUICK RECAP -------------------------
// 1. Class: template for object creation.
// 2. Object: real instance created with new.
// 3. Fields: variables that store object data.
// 4. Method: function written inside class.
// 5. main(): entry point of Java program.
// 6. Dot operator: access fields/methods.
// 7. Each object has its own data values.
// 8. Same method works for all objects.
// 9. OOP improves readability and reusability.
// 10. This file mixes notes + code for practice.