package az.atl.springjpa.service;

import az.atl.springjpa.dao.entity.StudentEntity;
import az.atl.springjpa.model.dto.StudentDto;
import az.atl.springjpa.model.request.StudentRequest;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    StudentDto createStudent(StudentRequest studentRequest);

    StudentDto findById(Long id);
   List<StudentDto> findAllStudents();

   void delete(Long id);
   void update(Long id,StudentDto studentDto);
}
