package az.atl.springjdbsexample.dao;

import az.atl.springjdbsexample.model.Student;

import java.util.List;
import java.util.Optional;
public interface StudentDao<E> {

    Optional<E> findById(Long id);
//    void create(Student student);
     List<E> findAll();
    void save(Student student);

    void update(Student student);

    int deleteById(Long id);
}
