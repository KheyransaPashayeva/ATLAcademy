package az.atl.springjpa.controller;

import az.atl.springjpa.model.dto.StudentDto;
import az.atl.springjpa.model.request.StudentRequest;
import az.atl.springjpa.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<StudentDto> creatStudent(@Valid  @RequestBody StudentRequest studentRequest) {
//        if (studentRequest.getName() == null || studentRequest.getSurname()==null || studentRequest.getAge()==null) {
//            throw new NullPointerException("field is null");
//        }
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createStudent(studentRequest));
    }
    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(studentService.findById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<StudentDto>> findAllStudent(){
        return  ResponseEntity.ok(studentService.findAllStudents());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id,@RequestBody StudentDto studentDto){
        studentService.update(id,studentDto);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        studentService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
