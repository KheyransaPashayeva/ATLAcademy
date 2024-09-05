package az.atl.libraryapp.service;

import az.atl.libraryapp.model.dto.BookDto;
import az.atl.libraryapp.model.request.BookRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BookService {
    BookDto create(BookRequest bookRequest);
    BookDto findById(Long id);
    List<BookDto> findAll();
    void update(Long id,BookDto bookDto);
    void delete(Long id);


}
