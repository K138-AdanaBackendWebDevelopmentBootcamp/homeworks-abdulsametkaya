package week03.repository;

import com.week03.models.Instructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class InstructorRepository implements ICrudRepository<Instructor>{

    @PersistenceContext
    EntityManager em;

    @Override
    public List<Instructor> findAll() {
        return em.createQuery("from Instructor i", Instructor.class).getResultList();
    }

    @Override
    public Instructor findById(int id) {
        return em.find(Instructor.class,id);
    }

    @Override
    public void saveToDatabase(Instructor instructor) {
        em.getTransaction();
        em.persist(instructor);
        em.getTransaction().commit();
    }

    @Override
    public void deleteFromDatabaseById(int id) {
        Instructor instructor = em.createQuery
                        ("from Instructor i where i.id = :id" , Instructor.class)
                .getSingleResult();
        if (instructor != null){
            em.remove(instructor);
        }else throw new NullPointerException();
    }

    @Override
    public void updateOnDatabase(Instructor instructor) {
        em.getTransaction();
        em.merge(instructor);
        em.getTransaction().commit();
    }
}
