package az.atl.springcustomer.dao.repository;

import az.atl.springcustomer.dao.entity.CustomerEntity;
import lombok.Value;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {
    @Query(value = "SELECT * FROM CustomerEntity",nativeQuery = true)
    List<String> findByName(@Param("name") String name);
    @EntityGraph(value = "Customer.orders")
    List<CustomerEntity> findAll();

    @Query("SELECT c FROM CustomerEntity c JOIN FETCH c.orders")
    List<CustomerEntity>findAllCustom();

    @Query(nativeQuery = true,
            value = "select * from customers c where " +
                    "(extract(day from c.birthday) =  extract(day from CURRENT_DATE) and " +
                    "extract(month from c.birthday) = extract(month from CURRENT_DATE)) ")
    List<CustomerEntity> findByBirthDay();
}
