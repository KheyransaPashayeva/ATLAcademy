package az.atl.libraryapp.service.impl;

import az.atl.libraryapp.dao.entity.AuthorEntity;
import az.atl.libraryapp.dao.entity.BookEntity;
import az.atl.libraryapp.dao.repository.BookRepository;
import az.atl.libraryapp.exception.AuthorNotFoundException;
import az.atl.libraryapp.exception.BookNotFoundException;
import az.atl.libraryapp.mapper.BookMapper;
import az.atl.libraryapp.model.dto.BookDto;
import az.atl.libraryapp.model.request.BookRequest;
import az.atl.libraryapp.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class BookServiceImpl implements BookService {
    private  final BookMapper bookMapper;
    private final BookRepository bookRepository;
    @Override
    public BookDto create(BookRequest bookRequest) {
        BookEntity bookEntity=bookMapper.toEntity(bookRequest);
      return  bookMapper.toDto(bookRepository.save(bookEntity));
    }

    @Override
    public BookDto findById(Long id) {
        return bookRepository.findById(id)
                .map(bookMapper::toDto)
                .orElseThrow(()->new BookNotFoundException("student not found with id"+id));
    }

    @Override
    public List<BookDto> findAll() {
        return  bookRepository.findAll().stream()
                .map(bookMapper::toDto)
                .toList();
    }

    @Override
    public void update(Long id, BookDto bookDto) {
        BookEntity bookEntity = bookRepository.findById(id)
                .orElseThrow(()-> new BookNotFoundException("student id not found"));
        bookEntity.setName(bookDto.getName());
        bookEntity.setCount(bookDto.getCount());
        bookRepository.save(bookEntity);
    }

    @Override
    public void delete(Long id) {
        bookRepository.findById(id)
                .ifPresent(studentEntity ->  bookRepository.deleteById(id));

    }
}
