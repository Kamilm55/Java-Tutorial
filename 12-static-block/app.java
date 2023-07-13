class Mobile
{
    String brand ;
    int price ;
    String type;

    // Static block

    static 
    {
        
    }

    Mobile()
    {
        brand = "Samsung";
        price = 500;
        System.out.println("in constructor");
        
        // Constructor calls every creation of object
    }
}


public class app
{
    public static void main(String args[])
    {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Mobile m3 = new Mobile();
        
        Mobile phones[] = new Mobile[3];

        phones[0] = m1;
        phones[1] = m2;
        phones[2] = m3;

        for(Mobile i : phones)
        {
           System.out.println(i.brand + ":" + i.price + ":" + i.type);
        }
        
    }
}