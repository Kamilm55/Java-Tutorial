package Phone;

public class Phone {
    private String model;
    private String os;
    private int RAM = 4; //default value
    private int ROM = 32;//default value
    private double screenSize;

    public Phone() {
    }

    public String getModel() {
        return model;
    }

    public int getRAM() {
        return RAM;
    }

    public int getROM() {
        return ROM;
    }

    public double getScreenSize() {
        return screenSize;
    }
    public String getOs() {
        return os;
    }

    public Phone setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return  this; // we use this when create Phone instance that's why type sould be Phone and therefore we must return Phone type obj
    }

    public Phone setROM(int ROM) {
        this.ROM = ROM;
        return  this;
    }

    public Phone setRAM(int RAM) {
        this.RAM = RAM;
        return  this;
    }

    public Phone setOs(String os) {
        this.os = os;
        return  this;
    }

    public Phone setModel(String model) {
        this.model = model;
        return  this;
    }

    public Phone(String model, String os , int RAM , int ROM , double screenSize ){
        this.model = model;
        this.os = os;
        this.RAM = RAM;
        this.ROM = ROM;
        this.screenSize = screenSize;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", os='" + os + '\'' +
                ", RAM=" + RAM + "gb" +
                ", ROM=" + ROM + "gb" +
                ", screenSize=" + screenSize +
                '}';
    }
}
