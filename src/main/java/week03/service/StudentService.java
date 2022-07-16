package week03.service;

import com.week03.models.Student;
import com.week03.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements BaseService<Student>  {

    StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public void saveToDatabase(Student student) {
        studentRepository.saveToDatabase(student);
        System.out.println(student + " is saved...");
    }

    @Override
    public void deleteFromDatabaseById(int id) {
        studentRepository.deleteFromDatabaseById(id);
        System.out.println("Deleted...");

    }

    @Override
    public void updateOnDatabase(Student student) {
        studentRepository.updateOnDatabase(student);
        System.out.println("Updated...");


    }
}
