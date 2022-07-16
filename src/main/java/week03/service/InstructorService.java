package week03.service;


import com.week03.models.Instructor;
import com.week03.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService implements BaseService<Instructor>  {

    InstructorRepository instructorRepository;


    @Autowired
    public InstructorService(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public List<Instructor> findAll() {

        return instructorRepository.findAll();
    }

    @Override
    public Instructor findById(int id) {

        return instructorRepository.findById(id);
    }

    @Override
    public void saveToDatabase(Instructor instructor) {
        instructorRepository.saveToDatabase(instructor);
        System.out.println(instructor +" is saved...");
    }

    @Override
    public void deleteFromDatabaseById(int id) {
        instructorRepository.deleteFromDatabaseById(id);
        System.out.println("Deleted...");

    }

    @Override
    public void updateOnDatabase(Instructor instructor) {
        instructorRepository.updateOnDatabase(instructor);
        System.out.println("Updated...");

    }
}
