package week01;

import java.time.LocalDate;
import java.util.List;


public class Student extends Person{

    private LocalDate birthDate;
    private String gender;
    private List<Course> courses;

    public Student() {
    }

    public Student(String name, Address address, LocalDate birthDate, String gender, List<Course> courses) {
        super(name, address);
        this.birthDate = birthDate;
        this.gender = gender;
        this.courses = courses;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                ", courses=" + courses +
                "} " + super.toString();
    }
}
