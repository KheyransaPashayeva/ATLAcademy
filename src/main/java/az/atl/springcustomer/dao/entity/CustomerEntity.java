package az.atl.springcustomer.dao.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="customers")
@NamedEntityGraph(name = "CustomerEntity.orders",
        attributeNodes = @NamedAttributeNode("orders"))
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name",nullable = false)
    private String name;
    @Column(name="surname",nullable = false)
    private String lastName;
    @Email
    @Column(name="email",nullable = false)
    private String email;
    @Column(name="country",nullable = false)
    private String country;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<OrderEntity> orders;
    @Column(name = "birthday")
    private LocalDate birthdate;
}
