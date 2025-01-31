package az.atl.springjpa.dao.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "age")
    private Integer age;
//    public static StudentEntityBuilder builder(){
//            return new StudentEntityBuilder();
//       }
//    public static class StudentEntityBuilder{
//        private Long id;
//        private String name;
//        private String surname;
//        private Integer age;
//
//        public StudentEntityBuilder id(Long id) {
//            this.id = id;
//            return this;
//        }
//
//        public StudentEntityBuilder name(String name) {
//            this.name = name;
//            return this;
//        }
//
//        public StudentEntityBuilder surname(String surname) {
//            this.surname = surname;
//            return this;
//        }
//
//        public StudentEntityBuilder age(Integer age) {
//            this.age = age;
//            return this;
//        }
//        public StudentEntity build() {
//            return new StudentEntity(id,name,surname,age);
//        }
//    }

}
