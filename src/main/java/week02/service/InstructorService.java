package week02.service;

import week02.models.Instructor;
import week02.repository.CrudRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class InstructorService implements CrudRepository<Instructor> {


    @Override
    public List<Instructor> findAll() {
        return entityManager.createQuery("FROM Instructor", Instructor.class).getResultList();
    }

    @Override
    public Instructor findById(int id) {
        return entityManager.find(Instructor.class,id);
    }

    @Override
    public void saveToDatabase(Instructor instructor) {

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(instructor);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }

    }

    @Override
    public void deleteFromDatabase(Instructor instructor) {

        try {
            entityManager.getTransaction().begin();
            entityManager.remove(instructor);
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
            Instructor foundInstructor = findById(id);
            entityManager.remove(foundInstructor);
            entityManager.getTransaction().commit();
            System.out.println("Deleted");
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }

    }

    @Override
    public void updateOnDatabase(Instructor instructor) {

        try {
            entityManager.getTransaction().begin();

            entityManager.merge(instructor);

            entityManager.getTransaction().commit();
            System.out.println("Deleted");
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }

    }
}
