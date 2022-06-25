import java.util.List;
import java.util.Scanner;

public class VisitingResources extends Person implements Instructor{

    private String phoneNumber;
    private List<Course> courses;
    private final int wage = 50;
    private int salary = salary();

    public VisitingResources() {
    }

    public VisitingResources(String name, Address address, String phoneNumber, List<Course> courses) {
        super(name, address);
        this.phoneNumber = phoneNumber;
        this.courses = courses;
    }

    @Override
    public int salary() {

        System.out.println("Please enter your total working hours");
        Scanner scan = new Scanner(System.in);

        int hour = scan.nextInt();

        return hour * wage;
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
        return "VisitingResources{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", courses=" + courses +
                ", salary=" + salary +
                "} " + super.toString();
    }
}
