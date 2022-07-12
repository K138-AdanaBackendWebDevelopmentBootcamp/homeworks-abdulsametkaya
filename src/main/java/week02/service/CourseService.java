package week02.service;
import week02.models.Course;
import week02.repository.CrudRepository;

import java.util.List;

public class CourseService implements CrudRepository<Course> {


    @Override
    public List<Course> findAll() {

        return entityManager.createQuery("FROM Course", Course.class).getResultList();
    }

    @Override
    public Course findById(int id) {
        return entityManager.find(Course.class,id);
    }

    @Override
    public void saveToDatabase(Course course) {

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(course);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }


    }
    @Override
    public void deleteFromDatabase(Course course) {

        try {
            entityManager.getTransaction().begin();
            entityManager.remove(course);
            entityManager.getTransaction().commit();
            System.out.println("Deleted");
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public void deleteFromDatabaseById(int id) {

        try {
            entityManager.getTransaction().begin();
            Course foundCourse = findById(id);
            entityManager.remove(foundCourse);
            entityManager.getTransaction().commit();
            System.out.println("Deleted");
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }

    }

    @Override
    public void updateOnDatabase(Course course) {

        try {
            entityManager.getTransaction().begin();

            entityManager.merge(course);

            entityManager.getTransaction().commit();
            System.out.println("Deleted");
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }

    }

}
