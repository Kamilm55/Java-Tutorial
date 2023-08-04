package Factory;

public class ComputerFactory {
    public static Computer createComp(String compType,String ram, String hdd, String cpu)
    {
        if(compType.equals("pc"))
            return new PC(ram, hdd, cpu);
        else if (compType.equals("server"))
            return new Server(ram, hdd, cpu);
        else
            throw new IllegalArgumentException("There is no computer with this type");
    }

}
