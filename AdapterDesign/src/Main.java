// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import Maps.GoogleMap;
import Maps.GoogleMapAdapter;
import Maps.Map;
import Maps.MyMap;

// Map interface for all maps
// I have MyMap

//we need googleMap , and we see already we have googleMap third-party class implements other interface
// we must use this without touching source code of googleMap
//we make adapter that convert googleMap to googleMapAdapter that is compatible with my interface and actually googleMap does this issue
public class Main {
    public static void main(String[] args) {
        Map map1 = new MyMap();
        map1.showLocation(125.6,140);

//    Actually we can do so, but type of maps and method name will be different;
//        location and showLocation is same method that we want to implement
//        GoogleMap g = new GoogleMap();
//        g.location(139,72.56);

//        i want this , but not working , to achieve this we should use adapter
//        Map map2= new GoogleMap();
//        map2.showLocation(139,72.56);

        Map map2 = new GoogleMapAdapter();
        map2.showLocation(112.8,72.59);
    }
}