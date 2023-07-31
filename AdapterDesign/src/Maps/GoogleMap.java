package Maps;

//source code from third party library
// You can use , but don't change anything!
public class GoogleMap implements GoogleInterface
{
    @Override
    public void location(double latitude, double longitude) {
        System.out.println("Original google map location!");
        System.out.println("Location is: " + latitude + "lat and " + longitude + "long ");
        System.out.println("This is from Google");
    }
}
