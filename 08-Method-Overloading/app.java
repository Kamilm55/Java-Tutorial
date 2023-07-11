class Calculator
{
    public int add(int n1 , int n2)
    {
        return n1 + n2;
    }
    public int add(int n1 , int n2 , int n3)
    {
        return n1 + n2 + n3;
    }
    public double add(double n1 , double n2)
    {
        return n1 + n2;
    }

    //There are 3 Methods with the "same name" => add
    //But these differentiate with parameters
    //JVM automatically understand what we want to use
}


public class app {
    public static void main(String args[])
    {
        int num1 = 5;
        int num2 = 57;
        int num3 = 37;

        Calculator calc = new Calculator();//Calc is object which is can add 

        int answer1 = calc.add(num1,num2,num3); 
        int answer2 = calc.add(num1,num2);
        double answer3 = calc.add(8.9,7.5);

        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);

    }    
}
