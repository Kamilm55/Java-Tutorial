package Maps;

public class GoogleMapAdapter implements Map
{
    GoogleMap gMap = new GoogleMap();

    @Override
    public void showLocation(double latitude, double longitude) {
        gMap.location(latitude,longitude);
    }
}
