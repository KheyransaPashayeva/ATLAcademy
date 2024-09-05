package az.atl.libraryapp.mapper;

import az.atl.libraryapp.dao.entity.BookEntity;
import az.atl.libraryapp.model.dto.BookDto;
import az.atl.libraryapp.model.request.BookRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BookMapper {

    //@Mapping(source = "authorId",target = "author.id")
    BookEntity toEntity(BookRequest bookRequest);
   // @Mapping(source = "author.id", target = "authorId")
    BookDto toDto(BookEntity bookEntity);
}
