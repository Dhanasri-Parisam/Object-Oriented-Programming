/*
Procedural style (short description):
- Data and functions are separate.
- We pass values to functions to perform tasks.
- Good for small/simple programs.

Traditional OOP style (short description):
- Data and behavior are combined inside a class.
- We create objects, then call methods on those objects.
- Better for organizing larger programs.
*/

// Procedural style
class Main {
    public static void display(String branchname, int cupSold, int pricePerCup){
        System.out.println("branchname : " + branchname);
        System.out.println("cupSold : " + cupSold);
        System.out.println("pricePerCup : " + pricePerCup);
        System.out.println();
    }

    public static void main(String[] args) {

        // Branch 1
        String branch1Name = "allu";
        int branch1CupSold = 10;
        int branch1Price = 10;

        // Branch 2
        String branch2Name = "mb";
        int branch2CupSold = 20;
        int branch2Price = 20;

        // Branch 3
        String branch3Name = "nag";
        int branch3CupSold = 30;
        int branch3Price = 30;

        display(branch1Name, branch1CupSold, branch1Price);
        display(branch2Name, branch2CupSold, branch2Price);
        display(branch3Name, branch3CupSold, branch3Price);
    }
}


// OOP style

class coffe {

    String branchname;
    int cupSold;
    int pricePerCup;

    // Constructor
    public coffe(String branchname, int cupSold, int pricePerCup){
        this.branchname = branchname;
        this.cupSold = cupSold;
        this.pricePerCup = pricePerCup;
    }

    // Method
    void display(){
        System.out.println("branchname : " + branchname);
        System.out.println("cupSold : " + cupSold);
        System.out.println("pricePerCup : " + pricePerCup);
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {

        coffe branch1 = new coffe("allu", 10, 10);
        branch1.display();

        coffe branch2 = new coffe("mb", 20, 20);
        branch2.display();

        coffe branch3 = new coffe("nag", 30, 30);
        branch3.display();
    }
}