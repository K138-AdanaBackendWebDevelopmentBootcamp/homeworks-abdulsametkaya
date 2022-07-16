package week03.repository;

import com.week03.models.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class StudentRepository implements ICrudRepository<Student>{

    @PersistenceContext
    EntityManager em;

    @Override
    public List<Student> findAll() {
        return em.createQuery("from Student s", Student.class).getResultList();
    }

    @Override
    public Student findById(int id) {
        return em.find(Student.class,id);
    }

    @Override
    public void saveToDatabase(Student student) {
        em.getTransaction();
        em.persist(student);
        em.getTransaction().commit();

    }

    @Override
    public void deleteFromDatabaseById(int id) {
        Student student = em.createQuery
                        ("from Student s where s.id = :id" , Student.class)
                .getSingleResult();
        if (student != null){
            em.remove(student);
        }else throw new NullPointerException();

    }

    @Override
    public void updateOnDatabase(Student student) {
        em.getTransaction();
        em.merge(student);
        em.getTransaction().commit();
    }
}
