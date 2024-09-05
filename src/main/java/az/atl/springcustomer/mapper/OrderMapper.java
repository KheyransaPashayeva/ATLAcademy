package az.atl.springcustomer.mapper;


import az.atl.springcustomer.dao.entity.OrderEntity;
import az.atl.springcustomer.model.dto.OrderDto;
import az.atl.springcustomer.model.request.OrderRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderMapper {
        @Mapping(source = "customerId",target = "customer.id")
        OrderEntity toEntity(OrderRequest orderRequest);
        @Mapping(source = "customer.id", target = "customerId")
        OrderDto toDto(OrderEntity orderEntity);
}

