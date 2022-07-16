package week03.repository;

import com.week03.models.Course;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CourseRepository implements ICrudRepository<Course> {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional(readOnly = true)
    public List<Course> findAll() {
        return em.createQuery("from Course ", Course.class).getResultList();
    }

    @Override
    public Course findById(int id) {
        return em.find(Course.class, id);
    }

    @Override
    public void saveToDatabase(Course course) {
        em.getTransaction();
        em.persist(course);
        em.getTransaction().commit();
    }

    @Override
    public void deleteFromDatabaseById(int id) {
        Course course = em.createQuery("from Course c where c.id = :id", Course.class).getSingleResult();
        if (course != null) {
            em.remove(course);
        } else throw new NullPointerException();
    }

    @Override
    public void updateOnDatabase(Course course) {
        em.getTransaction();
        em.merge(course);
        em.getTransaction().commit();
    }
}
