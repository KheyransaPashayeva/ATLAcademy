package az.atl.libraryapp.exception.handler;

import az.atl.libraryapp.exception.AuthorNotFoundException;
import az.atl.libraryapp.exception.BookNotFoundException;
import az.atl.libraryapp.model.dto.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(AuthorNotFoundException.class)
    public ResponseEntity<ErrorDto> handleCustomerNotFound(AuthorNotFoundException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ErrorDto(404,
                        ex.getMessage(),
                        LocalDateTime.now()));
    }
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity<ErrorDto> handleCustomerNotFound(BookNotFoundException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ErrorDto(404,
                        ex.getMessage(),
                        LocalDateTime.now()));
    }

}
