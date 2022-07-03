package week02.models;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class VisitingResearcher extends Instructor{

   private int hourlySalary;

    public VisitingResearcher(){}
    public VisitingResearcher(String name, String address, long phoneNumber, List<Course> courseList, int hourlySalary) {
        super(name, address, phoneNumber, courseList);
        this.hourlySalary = hourlySalary;
    }

    public int getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(int hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    @Override
    public String toString() {
        return "VisitingResearcher{" +
                "hourlySalary=" + hourlySalary +
                "} ";
    }
}
