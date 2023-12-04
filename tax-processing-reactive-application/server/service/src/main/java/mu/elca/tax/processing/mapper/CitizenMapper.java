package mu.elca.tax.processing.mapper;

import mu.elca.tax.processing.dto.CitizenDto;
import mu.elca.tax.processing.entity.Citizen;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = { CityMapper.class })
public interface CitizenMapper {

    @Mapping(target = "city", source = "cityDto")
    @Mapping(target = "createdOn", ignore = true)
    @Mapping(target = "updatedOn", ignore = true)
    @Mapping(target = "id", ignore = true)
    Citizen mapToEntity(CitizenDto citizenDto);

    @Mapping(target = "cityDto", source = "city")
    CitizenDto mapToDto(Citizen citizen);

}