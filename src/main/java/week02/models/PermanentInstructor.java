package week02.models;

import javax.persistence.Entity;
import java.util.List;
import java.util.Objects;

@Entity
public class PermanentInstructor extends Instructor{
    private int fixedSalary;

    public PermanentInstructor(){}

    public PermanentInstructor(String name, String address, long phoneNumber, List<Course> courseList, int fixedSalary) {
        super(name, address, phoneNumber, courseList);
        this.fixedSalary = fixedSalary;
    }

    public int getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public String toString() {
        return "PermanentInstructor{" +
                "fixedSalary=" + fixedSalary +
                "} ";
    }
}
