package week03.service;

import com.week03.models.Course;
import com.week03.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements BaseService<Course>  {

    CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public CourseService() {
    }

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course findById(int id) {
        return courseRepository.findById(id);
    }

    @Override
    public void saveToDatabase(Course course) {
        courseRepository.saveToDatabase(course);
        System.out.println(course +" is saved...");
    }

    @Override
    public void deleteFromDatabaseById(int id) {
        courseRepository.deleteFromDatabaseById(id);
        System.out.println("Deleted...");
    }

    @Override
    public void updateOnDatabase(Course course) {
        courseRepository.updateOnDatabase(course);
        System.out.println("Updated...");
    }
}
