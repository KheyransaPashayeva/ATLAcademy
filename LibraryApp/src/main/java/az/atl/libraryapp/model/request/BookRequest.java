package az.atl.libraryapp.model.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
public class BookRequest {
    private String name;
    private Integer count;
    private Long authorId;
}
