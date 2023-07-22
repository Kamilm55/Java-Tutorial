// https://www.geeksforgeeks.org/inheritance-in-java

// class Bike
// Inheritance variable and methods
// class MountBike

import vehicles.*; // All files inside vehicles folder
// import vehicles.Bike;
// import vehicles.MountBike;

public class App {
    public static void main(String[] args) {

        for(int i=0;i<args.length;i++)
        System.out.println("Args: " + args[i]);

        // Creating a Bike object with gear 5 and initial speed 50
        Bike b1 = new Bike(5, 55);
        // Applying break and increasing speed
        b1.applyBreak(5);
        b1.incSpeed(15);

        // Printing the bike details using toString method
        System.out.println(b1.toString());
    
        System.out.println();

        MountBike mb1 = new MountBike(2, 60, 10);
        mb1.applyBreak(22);
        mb1.incSpeed(35);

        System.out.println(mb1.toString());
    
    }

}