package az.atl.springcustomer.controller;

import az.atl.springcustomer.model.dto.CustomerDto;
import az.atl.springcustomer.model.request.CustomerRequest;
import az.atl.springcustomer.service.CustomerService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@Validated
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDto> getById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(customerService.findById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<CustomerDto>> getAll(){

        return ResponseEntity.ok(customerService.findAll());
    }
    @PostMapping()
    public ResponseEntity<CustomerDto> create(@Valid @RequestBody CustomerRequest customerRequest){
        return ResponseEntity.status(HttpStatus.OK).body(customerService.create(customerRequest));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id,@Valid @RequestBody CustomerDto customerDto){
        customerService.update(id,customerDto);
       return ResponseEntity.ok().build();
        

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        customerService.delete(id);
        return ResponseEntity.ok().build();
    }

}
