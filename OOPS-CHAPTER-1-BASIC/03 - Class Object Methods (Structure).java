1️⃣ Step 1: Create a Class

A class defines what data and behavior objects will have.

Structure:

class ClassName {

    // variables (data)

    // methods (functions)

}

Example:

class Coffee {

    String branchName;
    int cupSold;
    int pricePerCup;

}

Here:

Part	Meaning
class	keyword
Coffee	class name
variables	data of object
2️⃣ Step 2: Create Methods Inside Class

A method defines behavior of the object.

Example:

class Coffee {

    String branchName;
    int cupSold;
    int pricePerCup;

    void display(){
        System.out.println("Branch: " + branchName);
        System.out.println("Cup Sold: " + cupSold);
        System.out.println("Price: " + pricePerCup);
    }
}

Breakdown of method:

Part	Meaning
void	return type
display	method name
()	parameters
{}	method body
3️⃣ Step 3: Create Main Class

Java program starts from main() method.

class Main {

    public static void main(String[] args){

    }

}
4️⃣ Step 4: Create Object

Inside main() we create objects.

Syntax:

ClassName objectName = new ClassName();

Example:

Coffee branch1 = new Coffee();

Breakdown:

Part	Meaning
Coffee	class datatype
branch1	object reference
new	creates object
Coffee()	constructor
5️⃣ Step 5: Assign Values

Objects store data.

branch1.branchName = "Allu";
branch1.cupSold = 10;
branch1.pricePerCup = 20;

Meaning:

branch1 object
branchName = Allu
cupSold = 10
pricePerCup = 20
6️⃣ Step 6: Call Method

Use the object to call methods.

branch1.display();

Flow:

branch1 → calls → display()
7️⃣ Complete Program
class Coffee {

    String branchName;
    int cupSold;
    int pricePerCup;

    void display(){
        System.out.println("Branch: " + branchName);
        System.out.println("Cup Sold: " + cupSold);
        System.out.println("Price: " + pricePerCup);
        System.out.println();
    }
}

class Main {

    public static void main(String[] args){

        Coffee branch1 = new Coffee();
        branch1.branchName = "Allu";
        branch1.cupSold = 10;
        branch1.pricePerCup = 20;

        Coffee branch2 = new Coffee();
        branch2.branchName = "MB";
        branch2.cupSold = 20;
        branch2.pricePerCup = 30;

        branch1.display();
        branch2.display();
    }
}