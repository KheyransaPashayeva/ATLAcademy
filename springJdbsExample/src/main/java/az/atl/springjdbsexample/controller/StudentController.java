package az.atl.springjdbsexample.controller;

import az.atl.springjdbsexample.exception.StudentNotFoundException;
import az.atl.springjdbsexample.model.Student;
import az.atl.springjdbsexample.service.StudentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.stream.FileImageOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/student")
public class StudentController {
    @Autowired
 private final StudentService studentService;

    @GetMapping("{id}")
    public ResponseEntity<Student> findById(@PathVariable Long id){
        if (id == null || id==0) {
            throw new IllegalArgumentException();
        }
        return ResponseEntity.ok(studentService.findById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents() {
        try {
            List<Student> students = studentService.findAll();

            if (students.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(students, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/student/create")
    public ResponseEntity<String> createStudent(@RequestBody Student student) {
        try {
            studentService.save(new Student());
            return new ResponseEntity<>("Student was created successfully.", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<String> updateStudent(@PathVariable("id") long id, @RequestBody Student student) {
        Student _student =studentService.findById(id);

        if ( _student != null) {
            _student.setId(id);
            _student.setName(student.getName());
            _student.setSurname(student.getSurname());
            _student.setAge(student.getAge());

           studentService.update(_student);
            return new ResponseEntity<>("Tutorial was updated successfully.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Cannot find Tutorial with id=" + id, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") long id) {
        try {
            int result = studentService.deleteById(id);
            if (result == 0) {
                return new ResponseEntity<>("Cannot find Tutorial with id=" + id, HttpStatus.OK);
            }
            return new ResponseEntity<>("Tutorial was deleted successfully.", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Cannot delete tutorial.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping(path = "/file-upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> uploadFile(@RequestBody MultipartFile file) {
        FileOutputStream fos = null;
        try {
            // Define the directory and file path
            String directoryPath = "C:/Users/TARIEL/Desktop/JavaBackend/springJdbsExample/src/" +
                    "main/java/az/atl/springjdbsexample/image";
            String filePath = directoryPath + "/uploadedFile.dat";

            // Create the directory if it does not exist
            File directory = new File(directoryPath);
            if (!directory.exists()) {
                directory.mkdirs();
            }
            // Create a new file output stream
            fos = new FileOutputStream(new File(filePath));

            // Write the byte array to the file
            fos.write(file.getBytes());
            fos.flush();

            return new ResponseEntity<>("File uploaded successfully", HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity<>("Error uploading file: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        } finally {
            // Close the output stream
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

