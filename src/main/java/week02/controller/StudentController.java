package week02.controller;

import week02.models.Course;
import week02.models.Student;
import week02.service.CourseService;
import week02.service.StudentService;

import java.util.List;

public class StudentController {

    private StudentService studentService = new StudentService();

    public List<Student> findAllStudents(){
        return studentService.findAll();
    }
    public Student findCourseById(int id){
        return studentService.findById(id);
    }
    public void saveStudent(Student student){studentService.saveToDatabase(student);}
    public void deleteStudent(Student student){studentService.deleteFromDatabase(student);}
    public void deleteStudentByCourseId(int id){studentService.deleteFromDatabaseById(id);}
    public void updateStudent(Student student){studentService.updateOnDatabase(student);}



}
