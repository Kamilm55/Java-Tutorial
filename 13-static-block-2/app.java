class Employee
{
    String name = "emp";
    // int numberOfEmp = 0;// non-Static TYPE
    static int numberOfEmp = 0;// nonStatic TYPE

   // Static means it belongs to all subclasses
   // we can access with class name Employee.number
   //if it is not static we cannot access in other places
    
//    static
//    {
//     System.out.println("in static");
//     numberOfEmp++;
//    }

    public Employee()
    {
    System.out.println("in constructor");
     numberOfEmp++;
    }

    void show()
    {
         System.out.println(name + " : " + numberOfEmp);
    }
}


public class app {

     public static void main(String[] args) {
        // System.out.println(Employee.name); // Not working ; Cannot make a static reference to the non-static field 
        // System.out.println(Employee.numberOfEmp);

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.show();
        emp2.show();

    }
}
