// Override toString() method which is method of Object class
// it is default method when we s.out(obj) it calls "obj.toString()"
// Override this
// Override equals method (this is also method of Object)
// ide should override equals and hashCode methods


class Computer
{
    private String brand;
    private int year;



    public Computer(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

     // ide application ( with source action)
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + year;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Computer other = (Computer) obj; // cast to Computer, called Downcasting
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (year != other.year)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Computer [brand=" + brand + ", year=" + year + "]";
    }

        // @Override
        // public String toString() {
        //     return "Brand: " + brand + ", Year: " + year;
        // }
    
         /* 
            public boolean equals(Object obj) {
                return (this == obj);
            }
         */

        // @Override 
        // public boolean equals(Object other) {
        //         return (this.brand == other.brand);
        //     } // I cannot apply


       
        
}

public class App {
    public static void main(String[] args) {
        Computer obj1 = new Computer("Lenovo",2005);
        Computer obj2 = new Computer("HP",2000);
        Computer obj3 = new Computer("Lenovo",2005);

        System.out.println(obj1);
        // System.out.println(obj1.toString()); 
        // In Object class has toString() method:classname + hashcode

        // public String toString() {
        //     return getClass().getName() + "@" + Integer.toHexString(hashCode());
        // }

        // toString is Default method called implicitly if specify nothing
        System.out.println(obj2);
        System.out.println(obj3);

            // boolean isEqual = obj1 == obj3; // false

            boolean isEqual1 = obj1.equals(obj3); 
            boolean isEqual2 = obj1.toString().equals(obj3.toString()); 
            boolean isEqual3 = obj1 == obj3; // false we cannot operator overload it is not method of Object class 

        System.out.println(isEqual1);
        System.out.println(isEqual2);
        System.out.println(isEqual3);

    }
}
