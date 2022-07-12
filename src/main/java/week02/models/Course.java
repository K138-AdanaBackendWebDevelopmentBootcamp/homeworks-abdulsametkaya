package week02.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Course_Name", length = 30, nullable = false)
    String courseName;

    @Column(name = "Course_Code", length = 30, nullable = false)
    String courseCode;

    @Column(name = "Credit_Score")
    int creditScore;

    @ManyToMany(mappedBy = "courseList")
    private List<Student> studentList = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "Instructor_Id")
    private Instructor instructor;

    Course() {
        studentList = new ArrayList<>();
    }

    public Course(String courseName, String courseCode, int creditScore, Instructor instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditScore = creditScore;
        this.instructor = instructor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        String instructorName = instructor != null ? instructor.getName() : "Not found";
        return "SchoolManagementSystem.Course{" +
                "courseName='" + courseName + '\'' +
                ", courseCode=" + courseCode +
                ", creditScore=" + creditScore +
                ", instructor=" + instructorName +
                '}';
    }

}

