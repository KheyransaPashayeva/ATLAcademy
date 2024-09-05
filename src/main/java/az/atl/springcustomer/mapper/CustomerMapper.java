package az.atl.springcustomer.mapper;

import az.atl.springcustomer.dao.entity.CustomerEntity;
import az.atl.springcustomer.model.dto.CustomerDto;
import az.atl.springcustomer.model.request.CustomerRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerMapper {
    CustomerEntity toEntity(CustomerRequest customerRequest);
//    @Mapping(source = "orders",target = "orders")
    CustomerDto toDto(CustomerEntity customerEntity);
}
