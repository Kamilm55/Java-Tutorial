package Prototype.templates;

import Prototype.templates.contracts.IPrototype;

import java.time.Duration;

public class Contractor extends Person implements IPrototype<Contractor> {
    private Department department;
    private String officeAddress;
    private Duration duration;


    public Contractor() {
        department = Department.NONE;
        officeAddress = "Office Address 1";
        duration = Duration.ofDays(30);
    }

    public Contractor(String firstName, String lastName, int age, String address, Department department, String officeAddress, Duration duration) {
        super(firstName, lastName, age, address);
        this.department = department;
        this.officeAddress = officeAddress;
        this.duration = duration;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public Contractor clone() {
        Contractor contractor = new Contractor(
                this.getFirstName(),this.getLastName(),this.getAge(),this.getAddress(),
                this.department,this.officeAddress,this.duration
        ); // shallow copy is enough for basic type and enums


        return contractor;
    }
}
