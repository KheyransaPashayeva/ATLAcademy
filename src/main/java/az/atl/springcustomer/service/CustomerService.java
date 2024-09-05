package az.atl.springcustomer.service;

import az.atl.springcustomer.dao.entity.CustomerEntity;
import az.atl.springcustomer.model.dto.CustomerDto;
import az.atl.springcustomer.model.request.CustomerRequest;

import java.util.List;

public interface CustomerService {
    CustomerDto create(CustomerRequest customerRequest);
    CustomerDto findById(Long id);
    List<CustomerDto> findAll();
    void update(Long id,CustomerDto customerDto);
    void delete(Long id);
    void birthDayIds();

}
