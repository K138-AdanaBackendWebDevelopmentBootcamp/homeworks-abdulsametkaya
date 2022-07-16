package week03.service;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BaseService<T> {

    List<T> findAll();
    T findById(int id);
    void saveToDatabase(T object);
    void deleteFromDatabaseById(int id);
    void updateOnDatabase(T object);

}
