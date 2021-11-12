package by.tms.homework8.task4;

public class Student {

    private String firstName;
    private String lastName;
    private Integer age;
    private Double pointAvg;

    public Student(String firstName, String lastName, int age, double pointAvg) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pointAvg = pointAvg;
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

    public Double getPointAvg() {
        return pointAvg;
    }

    public void setPointAvg(Double pointAvg) {
        this.pointAvg = pointAvg;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pointAvg=" + pointAvg +
                ", age=" + age +
                '}';
    }
}
