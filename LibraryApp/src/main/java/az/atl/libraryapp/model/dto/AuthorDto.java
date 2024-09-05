package az.atl.libraryapp.model.dto;

import az.atl.libraryapp.dao.entity.BookEntity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDto {
    private Long id;
    @NotBlank
    private String fullname;
   private List<BookEntity> books;
}
