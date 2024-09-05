package az.atl.libraryapp.service;

import az.atl.libraryapp.model.dto.AuthorDto;
import az.atl.libraryapp.model.dto.BookDto;
import az.atl.libraryapp.model.request.AuthorRequest;

import java.util.List;

public interface AuthorService {
    AuthorDto create(AuthorRequest authorRequest);
    AuthorDto findById(Long id);
    List<AuthorDto> findAll();
    void update(Long id, AuthorRequest authorRequest);
    void delete(Long id);
}
