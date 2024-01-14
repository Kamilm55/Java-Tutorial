package Prototype;

public class PrototypeMain {
    // Problem:
    //Say you have an object, and you want to create an exact copy of it. How would you do it?
    // First, you have to create a new object of the same class.
    // Then you have to go through all the fields of the original object and copy their values over to the new object.
    //Nice! But there’s a catch. Not all objects can be copied that way because some of the object’s fields
    // may be private and not visible from outside of the object itself.

    // There’s one more problem with the direct approach. Since you have to know the object’s class to create a duplicate,
    // your code becomes dependent on that class. If the extra dependency doesn’t scare you, there’s another catch.
    // Sometimes you only know the interface that the object follows, but not its concrete class, when, for example,
    // a parameter in a method accepts any objects that follow some interface.

    // Solution => https://refactoring.guru/design-patterns/prototype



}
