package Prototype.DeepCopyVsShallowCopy;

public class SamsungPhone {
    public SamsungPhone() {
    }

    public SamsungPhone(String version, String brand, int memory, Camera camera) {
        this.version = version;
        this.brand = brand;
        this.memory = memory;
        this.camera = camera;
    }

    private String version;
    private String brand;
    private int memory;
    private Camera camera; // Reference type field

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
}

class Camera {
    private String resolution;

    public Camera(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "resolution='" + resolution + '\'' +
                '}';
    }
}
