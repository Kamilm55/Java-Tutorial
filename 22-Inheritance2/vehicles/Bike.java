package vehicles;

public class Bike
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