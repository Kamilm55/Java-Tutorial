package com.FactoryDesign.Phones;

public class FactoryDesignSystem {
    public static Phone whichPhone(String req)
    {
        if(req == "Cheap")
            return  new Iphone();
        else if(req == "Reliable")
            return  new Samsung();
        else if(req == "Call")
            return  new Nokia();
        else{
            return  new Xiaomi();
        }
    }
}
