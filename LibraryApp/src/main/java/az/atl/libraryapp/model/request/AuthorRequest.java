package az.atl.libraryapp.model.request;

import az.atl.libraryapp.dao.entity.BookEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorRequest {
    private String fullname;
}
