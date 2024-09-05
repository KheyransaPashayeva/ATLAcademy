package az.atl.springjdbsexample.exception.handler;

import az.atl.springjdbsexample.exception.StudentNotFoundException;
import az.atl.springjdbsexample.model.dto.ErrorDto;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {
   @ResponseStatus(HttpStatus.NOT_FOUND)
   @ExceptionHandler(StudentNotFoundException.class)
public ResponseEntity<ErrorDto> handleStudentNotFound(StudentNotFoundException ex){
    return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body(new ErrorDto(404,
                    ex.getMessage(),
                    LocalDateTime.now()));
}
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<ErrorDto> handleEmptyResultDataAccessException(EmptyResultDataAccessException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ErrorDto(400,
                        ex.getMessage(),
                        LocalDateTime.now()));
    }

}
