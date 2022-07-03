package week02.repository;

import week02.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.util.List;

public interface CrudRepository<T> {

    EntityManager entityManager = EntityManagerUtils.getEntityManager("mysqlPU");

    List<T> findAll();
    T findById(int id);
    void saveToDatabase(T object);
    void deleteFromDatabase(T object);
    void deleteFromDatabaseById(int id);
    void updateOnDatabase(T object);
}
