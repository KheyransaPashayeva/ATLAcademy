package az.atl.security.model.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    private String name;
    private String surname;
    private String username;
    private String password;
    private Integer age;

}
