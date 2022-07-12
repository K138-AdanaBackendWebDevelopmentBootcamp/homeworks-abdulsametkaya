package week02.service;

import week02.models.Instructor;
import week02.models.Student;
import week02.repository.CrudRepository;

import java.util.List;


public class StudentService implements CrudRepository<Student> {


    @Override
    public List<Student> findAll() {
        return entityManager.createQuery("FROM Instructor", Student.class).getResultList();
    }

    @Override
    public Student findById(int id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    public void saveToDatabase(Student student) {

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(student);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }

    }

    @Override
    public void deleteFromDatabase(Student student) {

        try {
            entityManager.getTransaction().begin();
            entityManager.remove(student);
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
            Student foundStudent = findById(id);
            entityManager.remove(foundStudent);
            entityManager.getTransaction().commit();
            System.out.println("Deleted");
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }

    }

    @Override
    public void updateOnDatabase(Student student) {

        try {
            entityManager.getTransaction().begin();

            entityManager.merge(student);

            entityManager.getTransaction().commit();
            System.out.println("Deleted");
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }

    }
}
