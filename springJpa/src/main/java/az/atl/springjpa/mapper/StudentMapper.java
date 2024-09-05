package az.atl.springjpa.mapper;

import az.atl.springjpa.dao.entity.StudentEntity;
import az.atl.springjpa.model.dto.StudentDto;
import az.atl.springjpa.model.request.StudentRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentMapper {
    @Mapping(source = "name",target = "name")
    StudentEntity toEntity(StudentRequest studentRequest);
    StudentDto toDto(StudentEntity studentEntity);

}
