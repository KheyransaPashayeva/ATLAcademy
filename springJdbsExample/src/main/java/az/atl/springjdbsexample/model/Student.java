package az.atl.springjdbsexample.model;

import lombok.*;

import java.util.Objects;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Student {
    private Long id;
    private String name;
    private String surname;
    private Integer age;

}
