package az.atl.springcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCustomerApplication.class, args);
    }

}
