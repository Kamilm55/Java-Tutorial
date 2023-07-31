package Person;

public class Person {
    private String name;
    private int age;
    private String address;
    private String phoneNumber = "+994 ...";//default

    public Person(String name, int age, String address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Person(String name) { // Name is required
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + this.name + '\'' +
                ", age=" + age +
                ", adress='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public Person setName(String name){
        this.name = name;
        return this;
    }
    public Person setAddress(String address){
        this.address = address;
        return this;
    }
    public Person setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }
    public Person setAge(int age){
        this.age = age;
        return this;
    }

}
