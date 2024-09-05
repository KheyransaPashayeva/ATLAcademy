package az.atl.springcustomer.service;

import az.atl.springcustomer.dao.entity.OrderEntity;
import az.atl.springcustomer.model.dto.OrderDto;
import az.atl.springcustomer.model.request.OrderRequest;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    OrderDto findById(Long id);
    List<OrderDto> findAll();
    OrderDto save(OrderRequest orderRequest);
    void update(Long id,OrderDto orderDto);
    void delete(Long id);
}
