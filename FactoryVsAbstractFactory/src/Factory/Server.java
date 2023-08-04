package Factory;

public class Server implements Computer {
    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String toString() {
        return "Computer => Server =>{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }

    @Override
    public String getCPU() {
        return cpu;
    }

    public void  otherFuncServer() {
        System.out.println("Server functions");
    }

}
