package Factory;

public class PC implements Computer {
    private String ram;
    private String hdd;
    private String cpu;

    public PC(String ram, String hdd, String cpu) {
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
        return "Computer => PC => {" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }

    @Override
    public String getCPU() {
        return cpu;
    }

    public void  otherFuncPc() {
        System.out.println("PC functions");
    }

}
