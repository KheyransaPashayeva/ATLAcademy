
package az.atl.springjdbsexample.service;

import az.atl.springjdbsexample.dao.StudentDao;
import az.atl.springjdbsexample.exception.StudentNotFoundException;
import az.atl.springjdbsexample.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentDao<Student> studentDao;

    public Student findById(Long id) {
        return studentDao.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found with id" + id));
    }


    public void save(Student student) {
        studentDao.save(student);
    }

    public void update(Student student) {
        studentDao.update(student);
    }

    public int deleteById(long id) {
        return studentDao.deleteById(id);
    }

    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
