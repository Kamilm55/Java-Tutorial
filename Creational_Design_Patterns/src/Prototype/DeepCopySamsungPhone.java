package Prototype;

public class DeepCopySamsungPhone implements Cloneable{
    private String version;
    private String brand;
    private int memory;
    private Camera camera; // Reference type field
    public DeepCopySamsungPhone() {
    }

    public DeepCopySamsungPhone(String version, String brand, int memory, Camera camera) {
        this.version = version;
        this.brand = brand;
        this.memory = memory;
        this.camera = camera;
    }

    public DeepCopySamsungPhone(String version, String brand, int memory) {
        this.version = version;
        this.brand = brand;
        this.memory = memory;
    }

    public void takeAPhoto(){
        System.out.println("Take a photo with samsung");
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Camera getCamera() {
        return camera;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "SamsungPhone{" +
                "version='" + version + '\'' +
                ", brand='" + brand + '\'' +
                ", memory=" + memory +
                ", camera=" + camera +
                '}';
    }

    @Override
    public DeepCopySamsungPhone clone() {
        try {
            DeepCopySamsungPhone clone = (DeepCopySamsungPhone) super.clone();
            // Learn: This line uses the clone method provided by the Object class. It creates a shallow copy of the object.
            //  If any of the fields are reference types (i.e., objects), the references are copied, but the objects themselves are not duplicated.
            //  This is why a deep copy operation for mutable fields (like your Camera field) needs to be performed explicitly.
//            DeepCopySamsungPhone clone = new DeepCopySamsungPhone(this.version,this.brand,this.memory,new Camera(""));

            // TODO: copy mutable state here, so the clone can't change the internals of the original
            // Perform a deep copy for the Camera field
            clone.camera = new Camera(clone.getCamera().getResolution());

            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}


