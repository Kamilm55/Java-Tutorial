package Prototype;

public class DeepVsShallowCopy {

    public static void main(String[] args) {
//        SamsungPhone originalSamsung = new SamsungPhone("12.0.5","Galaxy a 5",16,new Camera("hd"));
////        originalSamsung.takeAPhoto();
//        System.out.println(originalSamsung);
//

//
//        SamsungPhone copySamsungPhone = new SamsungPhone();
//        copySamsungPhone.setBrand(originalSamsung.getBrand());
//        copySamsungPhone.setMemory(originalSamsung.getMemory());
//        copySamsungPhone.setVersion(originalSamsung.getVersion());
//        copySamsungPhone.setCamera(originalSamsung.getCamera());

        //Learn:
        // The code you provided is an example of a shallow copy. Let me explain why:
        // In the code, you are manually creating a new object (copySamsungPhone) and then copying the values of the fields
        // from the original object (originalSamsung) to the new object using setter methods.
        // This is a shallow copy because you are copying the primitive types and references from the original object
        // to the new object. If the fields of SamsungPhone were reference types (i.e., objects),
        // the references would be copied, but the objects themselves would not be duplicated.
        // In other words, the copied object and the original object would still share references to the same underlying objects.
        // If SamsungPhone has fields that are non-primitive types and you want to perform a deep copy (where the internal objects are also duplicated), you would need to implement a deep copy logic, possibly using the clone method for those objects or some other mechanism to create independent copies of the referenced objects.
        // In summary, the code you provided demonstrates a shallow copy because it manually copies the values and references from the original object to the new object.
//
//        System.out.println("original - " + originalSamsung);
//        System.out.println("copy - " + copySamsungPhone);
//
//        System.out.println("equal ? " + originalSamsung.equals(copySamsungPhone));
//        System.out.println("camera reference object equals ? " + originalSamsung.getCamera().equals(copySamsungPhone.getCamera()));
//
//
//        // same reference code => shallow copy
//        System.out.println(originalSamsung.getCamera().hashCode());
//        System.out.println(copySamsungPhone.getCamera().hashCode());
//        System.out.println("After change only original");
//        // if i modify camera in only one , it affects to both
//        copySamsungPhone.getCamera().setResolution("4K");
//        System.out.println("original - " + originalSamsung);
//        System.out.println("copy - " + copySamsungPhone);

        // todo: i modify (Reference Type object) in orginal obj but it changes also on copy obj ???
        // Cause: Shallow Copy

        // todo: How to do deep copy?
        // Clone interface , clone method

       DeepCopySamsungPhone originalSamsung2 = new DeepCopySamsungPhone("12.0.5","Galaxy a 7",16,new Camera("hdr"));
       DeepCopySamsungPhone deepCopySamsungPhone = originalSamsung2.clone();


        System.out.println("original - " + originalSamsung2);
        System.out.println("deep copy - " + deepCopySamsungPhone);

        System.out.println("equal ? " + originalSamsung2.equals(deepCopySamsungPhone));
        System.out.println("camera reference object equals ? " + originalSamsung2.getCamera().equals(deepCopySamsungPhone.getCamera()));


        // same reference code => shallow copy
        System.out.println(originalSamsung2.getCamera().hashCode());
        System.out.println(deepCopySamsungPhone.getCamera().hashCode());
        System.out.println("After change only original");
        // if i modify camera in only one , it affects to both
        deepCopySamsungPhone.getCamera().setResolution("4K");
        System.out.println("original - " + originalSamsung2);
        System.out.println("copy - " + deepCopySamsungPhone);

        // Learn: About clone method and Clonable marker interface =>
//        The clone method is indeed originally declared in the Object class, but using it requires that the class implements the Cloneable interface. The Cloneable interface serves as a marker interface to indicate that the implementing class supports the cloning operation through the clone method.
//        Here's how it works:
//        Default Implementation in Object:
//        The clone method is initially declared in the Object class, and its default behavior is to create a shallow copy of the object. However, this method is protected, and it throws CloneNotSupportedException unless the class implements the Cloneable interface.
//        Cloneable Interface:
//        The Cloneable interface is a marker interface, meaning it doesn't declare any methods. Its primary purpose is to indicate to the JVM that the class implementing it is designed to support cloning via the clone method. If a class does not implement Cloneable, attempting to call clone on an object of that class will result in a CloneNotSupportedException.
//        Enforcing Support for Cloning:
//        By implementing the Cloneable interface, a class essentially signals to the Java runtime that it is prepared to handle the cloning process. The clone method in Object checks if the object's class implements Cloneable. If it does not, the method throws a CloneNotSupportedException.

    }
}
