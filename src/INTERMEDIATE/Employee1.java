package INTERMEDIATE;

import java.util.List;

public class Employee1 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Integer> getSalary() {
        return salary;
    }

    public void setSalary(List<Integer> salary) {
        this.salary = salary;
    }

    public Employee1(String name, Integer id, String gender, List<Integer> salary) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.salary = salary;
    }

    private Integer id;
    private String gender;
    List<Integer> salary;



}
