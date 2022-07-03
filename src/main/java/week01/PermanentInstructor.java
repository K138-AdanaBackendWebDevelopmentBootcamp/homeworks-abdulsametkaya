package week01;

import java.util.List;
import java.util.Scanner;

public class PermanentInstructor extends Person implements Instructor {

    private String phoneNumber;
    private List<Course> courses;
    private int salary = salary();


    public PermanentInstructor() {
    }

    public PermanentInstructor(String name, Address address, String phoneNumber, List<Course> courses) {
        super(name, address);
        this.phoneNumber = phoneNumber;
        this.courses = courses;
    }

    @Override
    public int salary() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your course id");
        int courseid = scan.nextInt();
        int wage = 0;
        switch (courseid) {
            case 101:
                wage = matWage;
                break;
            case 102:
                wage = turkishWage;
                break;
            case 103:
                wage = geoWage;
                break;
            case 104:
                wage = historyWage;
                break;
        }

        return wage * hour;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "PermanentInstructor{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", courses=" + courses +
                ", salary=" + salary +
                "} " + super.toString();
    }
}
