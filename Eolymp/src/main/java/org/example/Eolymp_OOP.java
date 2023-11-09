package org.example;

import java.util.ArrayList;

class Eolymp_OOP{
    public static void main(String[] args) {
        ListOfPeople list = new ListOfPeople();

        String[] input = {
                "Person Ivanov Sergey 28",
                "Teacher Petrov Ivan 34 Physics 400",
                "Teacher Babayev Petr 28 Physics 450",
                "Person Lenov Yuriy 21",
                "Teacher Ermolov Kirill 44 Math 400",
                "Teacher Fedoseev Nikita 38 Math 630",
                "Teacher Egorova Dasha 32 Geography 450"
        };

        for (String personData : input) {
            String[] parts = personData.split(" ");
            String type = parts[0];

            if (type.equals("Person")) {
                String surname = parts[1];
                String name = parts[2];
                int age = Integer.parseInt(parts[3]);
                Person person = new Person(surname, name, age);
                list.add(person);
            } else if (type.equals("Teacher")) {
                String surname = parts[1];
                String name = parts[2];
                int age = Integer.parseInt(parts[3]);
                String subject = parts[4];
                int salary = Integer.parseInt(parts[5]);
                Teacher teacher = new Teacher(surname, name, age, subject, salary);
                list.add(teacher);
            }
        }

        // Print the number and list of Teachers
        System.out.println(list.GetNumberOfTeachers());
        System.out.print(list.getTeachers());

        // Print the number and list of People who are not Teachers
        System.out.println(list.GetNumberOfNotTeachers());
        System.out.print(list.getNotTeachers());
    }
}


class Person
{
    protected String Surname, Name;
    protected int Age;
    Person(String Surname, String Name, int Age) {
        this.Surname = Surname;
        this.Name = Name;
        this.Age = Age;
    }// Constructor
    public String toString() {
        return (Surname + " " + Name + " " +Age);
    }// print Surname Name Age
}

class Teacher extends Person
{
    protected String Subject;
    protected int Salary;
    Teacher(String Surname, String Name, int Age, String Subject, int Salary){
        super(Surname,Name,Age);
        this.Salary = Salary;
        this.Subject = Subject;
    } // Constructor
    public String toString(){
        return super.toString()  + " " + (Subject + " " + Salary);
    } // print Surname Name Age Subject Salary
}

class ListOfPeople
{
    String str = "";
    ArrayList<Person> a = new ArrayList<Person>();
    public void add(Person p) {
        a.add(p);
    }// Add person p to array list
    public int size() {
        return a.size();
    }// Return size of array list
    public String toString(){

        for (Person p : a) {
            str += p.toString() + "\n";
        }
    return str;

    } // Print people in array list. Each person print in a separate line

    public ListOfPeople getTeachers() {
        ListOfPeople copyOfListPeople = new ListOfPeople();
//        copyOfListPeople.a = this.a;
        copyOfListPeople.a.addAll(this.a);  // Create a copy of the ArrayList
        // Remove non-teacher objects
        copyOfListPeople.a.removeIf(p -> !(p instanceof Teacher));

        return copyOfListPeople;

    }// Return the list of Teachers only
    public int GetNumberOfTeachers(){
    return getTeachers().size();
    }
    // Return the number of Teachers in the list
    public ListOfPeople getNotTeachers() {
        ListOfPeople copyOfListPeople = new ListOfPeople();
//        copyOfListPeople.a = this.a;
        copyOfListPeople.a.addAll(this.a);  // Create a copy of the ArrayList
        // Remove teacher objects
        copyOfListPeople.a.removeIf(p -> p instanceof Teacher);
        return copyOfListPeople;
    } // Return the list of People who are not Teachers
    public int GetNumberOfNotTeachers() {
        return getNotTeachers().size();
    }// Return the number of People who are not Teachers in the list
}




////////////////////3
/*
class Eolymp_OOP{
    public static void main(String[] args) {

        String[] input = {
                "Person Ivanov Sergey 28",
                "Teacher Petrov Ivan 34 Physics 400",
                "Teacher Babayev Petr 28 Physics 450",
                "Person Lenov Yuriy 21",
                "Teacher Ermolov Kirill 44 Math 400",
                "Teacher Fedoseev Nikita 38 Math 630",
                "Teacher Egorova Dasha 32 Geography 450"
        };

        for (String personData : input) {
            String[] parts = personData.split(" ");
            String type = parts[0];

            String surname = parts[1];
            String name = parts[2];
            int age = Integer.parseInt(parts[3]);
            if (type.equals("Person")) {


                Person person = new Person(surname, name, age);
                System.out.println(person);
            } else if (type.equals("Teacher")) {
                String subject = parts[4];
                int salary = Integer.parseInt(parts[5]);
                Teacher teacher = new Teacher(surname, name, age, subject, salary);
                System.out.println(teacher);
            }
        }

    }
}

class Person
{
    protected String Surname, Name;
    protected int Age;
    Person(String Surname, String Name, int Age) {
        this.Surname = Surname;
        this.Name = Name;
        this.Age = Age;
    }// Constructor
    public String toString() {
        return (Surname + " " + Name + " " +Age);
    }// print Surname Name Age
}

class Teacher extends Person
{
    protected String Subject;
    protected int Salary;
    Teacher(String Surname, String Name, int Age, String Subject, int Salary){
        super(Surname,Name,Age);
        this.Salary = Salary;
        this.Subject = Subject;
    } // Constructor
    public String toString(){
        return super.toString()  + " " + (Subject + " " + Salary);
    } // print Surname Name Age Subject Salary
}*/

///////////////////////2
/*
class Eolymp_OOP{
    public static void main(String[] args) {

        String[] input = {
                "Rectangle 4 5",
                "Square 7",
                "Square 2"
        };

        for (String figure : input) {
            String[] parts = figure.split(" ");
            String type = parts[0];
            int a = Integer.parseInt(parts[1]);

            if (type.equals("Rectangle")) {
                int b = Integer.parseInt(parts[2]);
                Rectangle rectangle = new Rectangle(a, b);
                System.out.println(rectangle.Area() + " " + rectangle.Perimeter());
            } else if (type.equals("Square")) {
                Square square = new Square(a);
                System.out.println(square.Area() + " " + square.Perimeter());
            }
        }
    }
}

class Rectangle
{
    private int a, b; // private variable
    Rectangle(int a, int b){this.a=a;this.b=b;} // Constructor
    public int Area(){
        return a*b;
    } // return area
    public int Perimeter(){
        return 2 * (a+b);
    } // return perimeter
}

class Square extends Rectangle
{
    Square(int a){
        super(a,a);
    } // Constructor
}*/

///////////1
/*
class Shape
{
    private String shapeName; // private variable
    Shape(String name){
        this.shapeName = name;
    } // Constructor
    public String getShapeName() {
        return shapeName;
    }// return name of the shape
    public String toString(){
        return shapeName;
    } // Print the variable
}

class Circle extends Shape
{
    Circle(){
        super("Circle");
    } // Constructor
}

class Rectangle extends Shape
{
    Rectangle() {
        super("Rectangle");
    }// Constructor
}

class Triangle extends Shape
{
    Triangle(){
        super("Triangle");
    } // Constructor
}

class Eolymp_OOP {
    public static void main(String[] args) {
        String[] input = {"Circle", "Rectangle", "Triangle", "Rectangle"};

        Shape shapeObj = null;

        for (String shape : input) {
            switch (shape) {
                case "Circle":
                    shapeObj = new Circle();
                    break;
                case "Rectangle":
                    shapeObj = new Rectangle();
                    break;
                case "Triangle":
                    shapeObj = new Triangle();
                    break;
            }
            if (shapeObj != null)
                System.out.println(shapeObj);
        }
    }
}*/
