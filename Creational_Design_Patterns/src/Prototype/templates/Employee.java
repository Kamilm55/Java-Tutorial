package Prototype.templates;

import Prototype.templates.contracts.IPrototype;

public class Employee extends Person  implements IPrototype<Employee> {
    private Department department;
    private Role role;

    private String position;
    private String officeAddress;
    private double salary;

    public Employee() {
        department = department.NONE;
        role = Role.Regular;

        position = "Employee";
        officeAddress = "Office Address 1";
        salary = 5000d;
    }

    public Employee(String firstName, String lastName, int age, String address, String position, String officeAddress, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setAddress(address);
        this.position = position;
        this.officeAddress = officeAddress;
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public Employee clone() {
        Employee employee = new Employee(
               this.getFirstName(),this.getLastName(),this.getAge(),this.getAddress(),
               this.position,this.officeAddress,this.salary
               ); // shallow copy is enough for basic type

        //for reference type we must deep copy (you can do with Clonable interface)

        // default this is defined first created , we are sure it is not null

        // In this context, a shallow copy is sufficient, even for reference types like enums.
        employee.setDepartment(this.department);
        employee.setRole(this.role);

        return employee;
    }
}