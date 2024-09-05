package az.atl.springjpa.service.impl;

import az.atl.springjpa.dao.entity.StudentEntity;
import az.atl.springjpa.dao.repository.StudentRepository;
import az.atl.springjpa.exception.StudentNotFoundException;
import az.atl.springjpa.mapper.StudentMapper;
import az.atl.springjpa.model.dto.StudentDto;
import az.atl.springjpa.model.request.StudentRequest;
import az.atl.springjpa.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    @Override
    public StudentDto createStudent(StudentRequest studentRequest) {
//        StudentEntity studentEntity = new StudentEntity();
//        studentEntity.setName(studentRequest.getName());
//        studentEntity.setSurname(studentRequest.getSurname());
//        studentEntity.setAge(studentRequest.getAge());
//
//        StudentEntity student = studentRepository.save(studentEntity);
//        StudentDto studentDto = new StudentDto();
//        studentDto.setId(student.getId());
//        studentDto.setName(student.getName());
//        studentDto.setSurname(student.getSurname());
//        studentDto.setAge(student.getAge());
//        return studentDto;
        StudentEntity studentEntity =studentMapper.toEntity(studentRequest);
        return studentMapper.toDto(studentRepository.save(studentEntity));
    }

    @Override
    public StudentDto findById(Long id) {
//        StudentEntity studentEntity = studentRepository.findById(id).orElseThrow(()-> new StudentNotFoundException("student id not found"));
//        StudentDto studentDto = new StudentDto();
//        studentDto.setId(studentEntity.getId());
//        studentDto.setName(studentEntity.getName());
//        studentDto.setSurname(studentEntity.getSurname());
//        studentDto.setAge(studentEntity.getAge());
//        return studentDto;
       return studentRepository.findById(id)
                .map(studentMapper::toDto)
                .orElseThrow(()->new StudentNotFoundException("student not found with id"+id));
    }

    @Override
    public List<StudentDto> findAllStudents() {
//       List<StudentEntity> studentEntities=studentRepository.findAll()
//               .stream().toList();
//        List<StudentDto> studentDtos =new ArrayList<>();
//        for(StudentEntity studentEntity :studentEntities){
//             studentDtos.add(new StudentDto(studentEntity.getId(),
//                     studentEntity.getName(),
//                     studentEntity.getSurname(),
//                     studentEntity.getAge()));
//        }
//        return studentDtos;
       return studentRepository.findAll().stream()
                .map(studentMapper::toDto)
                .toList();
    }

    @Override
    public void delete(Long id) {
              studentRepository.findById(id)
                      .ifPresent(studentEntity ->  studentRepository.deleteById(id));
    }

    @Override
    public void update(Long id, StudentDto studentDto) {
//        StudentEntity studentEntity = studentRepository.findById(id).orElseThrow(()-> new StudentNotFoundException("student id not found"));
//               studentEntity.setId(studentDto.getId());
//               studentEntity.setName(studentDto.getName());
//               studentEntity.setSurname(studentDto.getSurname());
//               studentEntity.setAge(studentEntity.getAge());
//
//                studentRepository.save(studentEntity);



    }

}
