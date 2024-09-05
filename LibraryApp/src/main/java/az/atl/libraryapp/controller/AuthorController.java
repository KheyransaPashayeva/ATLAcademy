package az.atl.libraryapp.controller;

import az.atl.libraryapp.model.dto.AuthorDto;
import az.atl.libraryapp.model.request.AuthorRequest;
import az.atl.libraryapp.service.impl.AuthorServiceImpl;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@AllArgsConstructor
@RestController
@RequestMapping("api/v1/author")
public class AuthorController {
    private final AuthorServiceImpl authorService;

    @GetMapping("/{id}")
    public ResponseEntity<AuthorDto> getById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(authorService.findById(id));
    }
    @GetMapping("/all")
    public ResponseEntity<List<AuthorDto>> getAll(){

        return ResponseEntity.ok(authorService.findAll());

    }
    @PostMapping
    public ResponseEntity<AuthorDto> create(@RequestBody @Valid AuthorRequest authorRequest){
        return ResponseEntity.status(HttpStatus.OK).body(authorService.create(authorRequest));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id, @RequestBody AuthorRequest authorRequest){
        authorService.update(id,authorRequest);
        return  ResponseEntity.ok().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        authorService.delete(id);
        return ResponseEntity.ok().build();
    }
}
