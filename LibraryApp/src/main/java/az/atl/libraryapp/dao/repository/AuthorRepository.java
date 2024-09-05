package az.atl.libraryapp.dao.repository;

import az.atl.libraryapp.dao.entity.AuthorEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity,Long> {
    @EntityGraph(value = "Author.books")
    List<AuthorEntity> findAll();
}
