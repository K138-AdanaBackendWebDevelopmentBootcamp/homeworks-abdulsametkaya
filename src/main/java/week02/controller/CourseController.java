package week02.controller;


import week02.models.Course;
import week02.service.CourseService;

import java.util.List;

public class CourseController {
    private CourseService courseService = new CourseService();

    public List<Course> findAllCourses(){
        return courseService.findAll();
    }
    public Course findCourseById(int id){
        return courseService.findById(id);
    }
    public void saveCourse(Course course){courseService.saveToDatabase(course);}
    public void deleteCourse(Course course){courseService.deleteFromDatabase(course);}
    public void deleteCourseByCourseId(int id){courseService.deleteFromDatabaseById(id);}
    public void updateCourse(Course course){courseService.updateOnDatabase(course);}

}
