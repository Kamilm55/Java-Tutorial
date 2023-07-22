// https://www.geeksforgeeks.org/inheritance-in-java

// class Bike
// Inheritance variable and methods
// class MountBike

class Bike
{
    private int gear; // private only available in this class
    private int speed;

    // Default Constructor
    public Bike() {
        this.gear = 0;
        this.speed = 0;
    }

    // parametrized Constructor
    public Bike(int gear , int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }
    // Methods
    public void applyBreak(int speed)
    {
        this.speed -= speed;
    }

    public void incSpeed(int speed)
    {
        this.speed += speed;
    }

    public String toString()
    {
        // return ("Gear: " + this.gear + "\nSpeed: " + this.speed);
        return ("Gear: " + gear + "\nSpeed: " + speed);
    }

    // Getters and Setters
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    public int getSpeed()
    {
        return this.speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

}

class MountBike extends Bike
{
    private int seatNum;

    public MountBike(int seatNum , int speed , int gear)
    {
        super(gear,speed);
        this.seatNum = seatNum;
    }


    @Override
    public String toString()
    {
        // Super.speed => speed is private not show in this class we can get with getter
        // return ("Gear: " + super.getGear() + "\nSpeed: " + super.getSpeed() + "The number of seats: " + seatNum );
        return (super.toString() + "\nThe number of seats: " + seatNum );
    }
}

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