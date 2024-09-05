package az.atl.libraryapp.controller;

import az.atl.libraryapp.mapper.BookMapper;
import az.atl.libraryapp.model.dto.BookDto;
import az.atl.libraryapp.model.request.BookRequest;
import az.atl.libraryapp.service.impl.BookServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private  final BookServiceImpl bookService;


    @GetMapping("/{id}")
    public ResponseEntity<BookDto> getById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(bookService.findById(id));
    }
    @GetMapping("/all")
    public ResponseEntity<List<BookDto>> getAll(){
        return ResponseEntity.ok(bookService.findAll());
    }
    @PostMapping
    public ResponseEntity<BookDto> create(@RequestBody BookRequest bookRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.create(bookRequest));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id,@RequestBody BookDto bookDto){
        bookService.update(id,bookDto);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        bookService.delete(id);
        return ResponseEntity.ok().build();
    }
}
