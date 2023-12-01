package mu.elca.tax.processing.mapper;

import mu.elca.tax.processing.dto.CityDto;
import mu.elca.tax.processing.entity.City;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CityMapper {

    City mapToEntity(CityDto cityDto);

    CityDto mapToDto(City city);

}