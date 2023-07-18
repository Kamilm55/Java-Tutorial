
public class App
{
    public static void main(String[] args)
    {
        ScCalc ScCalculator = new ScCalc();
        int r1 = ScCalculator.add(5,8);
        int r2 = ScCalculator.sub(5,8);
        int r3 = ScCalculator.mul(5,8);
        int r4 = ScCalculator.div(5,8);
        int r5 = ScCalculator.pow(5,3);// Multilevel inheritance

        //Calc.add(5,9);// We cannot use non-static method with Class name

        System.out.println(r1 + " , " + r2+ " , " + r3+ " , " + r4+ " , " + r5);
    }
}