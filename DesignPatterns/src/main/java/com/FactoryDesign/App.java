//We have 3 types of phone
// Base class is phone
// client wants cheap and performant phone -> Xiaomi
// client wants cheap phone for only call -> Nokia
// client wants  phone for photo -> Iphone

//Then we can add some phone for some requests from the clients
package com.FactoryDesign;

import com.FactoryDesign.Phones.*;

class App
{
    public static void main(String[] args) {
        String req = "Reliable";
//        if(req == "cheap")
//        Phone p = new Nokia();
//        Phone p2 = new Iphone();
//        p.feauture();
    //For changing value we must change new Smth to new Other
    // It is not good to change in the main

        // client wants cheap and Reliable phone -> Samsung

        // Not to change code in main flow we use FactoryDesign pattern (creational)

        Phone p = FactoryDesignSystem.whichPhone(req);
        p.feauture();

        // We can add more models to FactoryDesignSystem
        // Then we don't need to change in this only we enter request
    }
}