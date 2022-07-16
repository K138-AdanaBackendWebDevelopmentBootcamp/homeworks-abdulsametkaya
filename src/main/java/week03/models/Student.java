package week03.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name ;

    private LocalDate birthDate;

    private String address;

    private String gender;
    @ManyToMany()
    @JoinTable(name = "student_course", joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "course_id")})
    private List<Course> courseList = new ArrayList<>();

    public Student(String name, LocalDate birthDate, String address, String gender, List<Course> courseList) {
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.gender = gender;
        this.courseList = courseList;
    }

}
