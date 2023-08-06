import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Base
{

    // Method
    public void display()
    {
        System.out.println("Base display()");
    }

    @SuppressWarnings("no usages")
    protected void func() {
        System.out.println("No usages warning");
    }
}
class  Derived extends Base
{
    @Override
    @DeprecatedMethod
    public void display()
    {
        System.out.println("It is true usage of @Override annotation");
    }
    @RunImmediately(times = 5)
    public void imFunc(){
        System.out.println("...");
    }
    @RunImmediately
    public void imFunc2(){
        System.out.println("...2");
    }
//    @Override// Compile-time Exception:Method does not override method from its superclass
//    public void display(String name)
//    {
//        System.out.println("It is False usage of @Override annotation" + name);
//    }

}

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // Creating object of this class inside main()
        Derived obj = new Derived();
//        Derived obj2 = new Derived();

        // Calling display() method inside main()
//        obj.display();

        // Custom annotations

        ExampleClass ex = new ExampleClass();
        ex.deprecatedMethod();
        ex.newMethod();


//        System.out.println(ex.getClass().isAnnotationPresent(DeprecatedMethod.class));// false this is not class type annotation
//        try {
//            System.out.println(ex.getClass().getMethod("deprecatedMethod").isAnnotationPresent(DeprecatedMethod.class));
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }
//       try{
//           System.out.println(ex.getClass().getMethod("newMethod").isAnnotationPresent(DeprecatedMethod.class));
//       }
//       catch (NoSuchMethodException e) {
//           throw new RuntimeException(e);
//       }
//
//       if(ex.getClass().getMethod("deprecatedMethod").isAnnotationPresent(DeprecatedMethod.class))
//       {
//           System.out.println("There is deprecated method in this app");
//       }

       for(Method method : obj.getClass().getDeclaredMethods()){
           if(method.isAnnotationPresent(RunImmediately.class)){
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                int count = annotation.times();
                for(int i=0; i<count;i++)
                    method.invoke(obj);
           }

       }
    }
}
