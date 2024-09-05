package az.atl.springcustomer.controller;

import az.atl.springcustomer.model.dto.CustomerDto;
import az.atl.springcustomer.model.dto.OrderDto;
import az.atl.springcustomer.model.request.CustomerRequest;
import az.atl.springcustomer.model.request.OrderRequest;
import az.atl.springcustomer.service.impl.OrderServiceImpl;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@Controller
@Validated
@RequestMapping("/api/v1/orders")
public class OrderController {
    private final OrderServiceImpl orderService;
    @GetMapping("/{id}")
    public ResponseEntity<OrderDto> getById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(orderService.findById(id));
    }
    @GetMapping("/all")
    public ResponseEntity<List<OrderDto>> getAll(){

        return ResponseEntity.ok(orderService.findAll());
    }

    @PostMapping()
    public ResponseEntity<OrderDto> create(@Valid @RequestBody OrderRequest orderRequest){
        return ResponseEntity.status(HttpStatus.OK).body(orderService.save(orderRequest));
    }
}
