package az.atl.springcustomer.service.impl;

import az.atl.springcustomer.dao.entity.OrderEntity;
import az.atl.springcustomer.dao.repository.OrderRepository;
import az.atl.springcustomer.exception.OrderNotFoundException;
import az.atl.springcustomer.mapper.OrderMapper;
import az.atl.springcustomer.model.dto.OrderDto;
import az.atl.springcustomer.model.request.OrderRequest;
import az.atl.springcustomer.service.OrderService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Data
@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;
    @Override
    public OrderDto findById(Long id) {
        return orderRepository.findById(id)
                .map(orderMapper::toDto)
                .orElseThrow(()-> new OrderNotFoundException("order not found"+id));
    }

    @Override
    public List<OrderDto> findAll() {
        return orderRepository.findAll().stream()
                .map(orderMapper::toDto).toList();
    }

    @Override
    @Transactional
    public OrderDto save(OrderRequest orderRequest) {
        OrderEntity orderEntity=orderMapper.toEntity(orderRequest);
        return orderMapper.toDto(orderRepository.save(orderEntity));
    }

    @Override
    public void update(Long id, OrderDto orderDto) {
        OrderEntity orderEntity = orderRepository.findById(id)
                .orElseThrow(()->new OrderNotFoundException("not found id"));
        orderEntity.setDescription(orderDto.getDescription());

    }


    @Override
    public void delete(Long id) {
        orderRepository.findById(id)
                .ifPresent(orderEntity -> orderRepository.deleteById(id))
        ;

    }
}
