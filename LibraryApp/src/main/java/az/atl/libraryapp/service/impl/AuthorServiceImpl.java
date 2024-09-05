package az.atl.libraryapp.service.impl;

import az.atl.libraryapp.dao.entity.AuthorEntity;
import az.atl.libraryapp.dao.repository.AuthorRepository;
import az.atl.libraryapp.exception.AuthorNotFoundException;
import az.atl.libraryapp.mapper.AuthorMapper;
import az.atl.libraryapp.model.dto.AuthorDto;
import az.atl.libraryapp.model.request.AuthorRequest;
import az.atl.libraryapp.service.AuthorService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorMapper authorMapper;
    private final AuthorRepository authorRepository;


    @Override
    @Transactional
    public AuthorDto create(AuthorRequest authorRequest) {
        AuthorEntity authorEntity=authorMapper.toEntity(authorRequest);
       return authorMapper.toDto(authorRepository.save(authorEntity));
    }

    @Override
    public AuthorDto findById(Long id) {
        return authorRepository.findById(id)
                .map(authorMapper::toDto)
                .orElseThrow(()->new AuthorNotFoundException("student not found with id"+id));
    }

    @Override
    public List<AuthorDto> findAll() {
        return authorRepository.findAll().stream()
                .map(authorMapper::toDto)
                .toList();
    }

    @Override
    public void update(Long id, AuthorRequest authorRequest) {
        AuthorEntity authorEntity = authorRepository.findById(id).orElseThrow(()-> new AuthorNotFoundException("student id not found"));
        authorEntity.setFullname(authorRequest.getFullname());
        authorRepository.save(authorEntity);
    }

    @Override
    public void delete(Long id) {
        authorRepository.findById(id)
                .ifPresent(studentEntity ->  authorRepository.deleteById(id));
    }
}
