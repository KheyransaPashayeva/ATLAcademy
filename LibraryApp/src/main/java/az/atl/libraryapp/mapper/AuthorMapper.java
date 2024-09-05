package az.atl.libraryapp.mapper;

import az.atl.libraryapp.dao.entity.AuthorEntity;
import az.atl.libraryapp.model.dto.AuthorDto;
import az.atl.libraryapp.model.request.AuthorRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthorMapper {
    AuthorEntity toEntity(AuthorRequest authorRequest);
    //@Mapping(source = "books",target = "books")
    AuthorDto toDto(AuthorEntity authorEntity);
}
