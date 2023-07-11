class Calculator
{
    public int add(int n1 , int n2)//This is method int is return type
    {
        return n1 + n2;
    }
}


public class app {
    public static void main(String args[])
    {
        int num1 = 5;
        int num2 = 57;

        //At first we must insert Object from class that we want to use
        //For ex: We should add 2 numbers.Calculator can do this
        //If we don't have any calculator automatically we cannot add
        //That's why firstly we get any calculator then we can use its feature 
        Calculator calc = new Calculator();//Calc is object which is can add some 2 numbers
        //type is Calculator
        //new is keyword used for creating new Object
        //"Calculator()" - shows which object jvm should create
        

        //This is feature of Calculator 
        //Method of class
        int answer = calc.add(num1,num2);

        System.out.println(answer);

    }    
}
