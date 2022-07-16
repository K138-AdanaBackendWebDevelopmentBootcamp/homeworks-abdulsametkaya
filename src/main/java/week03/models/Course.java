package week03.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String courseName;
    String courseCode;
    int creditScore;
    @ManyToMany(mappedBy = "courseList")
    private List<Student> studentList = new ArrayList<>();
    @ManyToOne()
    @JoinColumn(name = "id")
    private Instructor instructor;

    public Course(String courseName, String courseCode, int creditScore, Instructor instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditScore = creditScore;
        this.instructor = instructor;
    }


}

