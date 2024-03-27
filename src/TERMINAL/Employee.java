package TERMINAL;

public class Employee {

    @Override
    public String toString() {
        return "OLDER.Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(String name, String email, String gender, Integer salary) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    private String name;
    private String email;

    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    Integer salary;
}
