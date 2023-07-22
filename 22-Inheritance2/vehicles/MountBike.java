package vehicles;

public class MountBike extends Bike
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
