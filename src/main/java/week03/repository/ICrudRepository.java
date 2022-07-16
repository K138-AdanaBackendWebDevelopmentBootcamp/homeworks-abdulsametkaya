package week03.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICrudRepository<T> {

    List<T> findAll();
    T findById(int id);
    void saveToDatabase(T object);
    void deleteFromDatabaseById(int id);
    void updateOnDatabase(T object);
}
