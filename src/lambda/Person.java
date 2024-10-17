package lambda;

import java.time.LocalDate;
import java.util.*;

public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private double salary;
    private Date dob;
    
    public Person(Long id, String firstName , String lastName, double salary,Date date){
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDot() {
        return dob;
    }

    public void setDot(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
                + ", dob=" + dob + "]";
    }

    
}
