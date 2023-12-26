package ImperativeVsDeclarative;

public class Person {
    private String name;
    private String gender;
    private int age;

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
    public Person(String name, String gender,int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }


}
