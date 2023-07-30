//We have 3 types of phone
// Base class is phone
// client wants cheap and performant phone -> Xiaomi
// client wants cheap phone for only call -> Nokia
// client wants  phone for photo -> Iphone

//Then we can add some phone for some requests from the clients
package com.FactoryDesign;

import com.FactoryDesign.Phones.Nokia;
import com.FactoryDesign.Phones.Phone;

class App
{
    public static void main(String[] args) {
        Phone p = new Nokia();
        p.feauture();
    }
}