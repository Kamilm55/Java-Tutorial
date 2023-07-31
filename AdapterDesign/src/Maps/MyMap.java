package Maps;

public class MyMap implements Map
{
//    private double latitude;
//    private double longitude;
//    public MyMap(double latitude, double longitude)
//    {
//        this.latitude = latitude;
//        this.longitude = longitude;
//    }

    @Override
    public void showLocation(double latitude, double longitude) {
        System.out.println("Location is: " + latitude + "lat and " + longitude + "long ");
    }
}
