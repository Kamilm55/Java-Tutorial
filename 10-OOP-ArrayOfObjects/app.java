// /* public class Student*/ There cannot be two public classes in a single Java program.
 class Student
{
    String name;
    int mark;
}

public class app 
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.name = "Kamil";
        s2.name = "Amil";
        s3.name = "Ramil";
        s1.mark = 91;
        s2.mark = 99;
        s3.mark = 81;

        //All Students must be one array
        Student sinif[] = new Student[3];
         //If it is Array do not to write "()" new Student() => new Student["Length"]

        sinif[0] = s1;
        sinif[1] = s2;
        sinif[2] = s3;

        for(Student i : sinif)
        {
           System.out.println(i.name + ":" + i.mark);
        }

        
    }
}