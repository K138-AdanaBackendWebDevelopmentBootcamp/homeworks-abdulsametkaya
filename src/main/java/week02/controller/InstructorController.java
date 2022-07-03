package week02.controller;

import week02.models.Course;
import week02.models.Instructor;
import week02.service.InstructorService;


import java.util.List;

public class InstructorController {
    private InstructorService instructorService = new InstructorService();

    public List<Instructor> findAllInstructors(){
        return instructorService.findAll();
    }
    public Instructor findInstructorById(int id){
        return instructorService.findById(id);
    }
    public void saveInstructor(Instructor instructor){
        instructorService.saveToDatabase(instructor);
    }
    public void deleteInstructor(Instructor instructor){instructorService.deleteFromDatabase(instructor);}
    public void deleteInstructorById(int id){instructorService.deleteFromDatabaseById(id);}
    public void updateInstructor(Instructor instructor){instructorService.updateOnDatabase(instructor);}
}
