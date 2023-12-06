package mu.elca.tax.processing.mapper;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import mu.elca.tax.processing.dto.CitizenDto;
import mu.elca.tax.processing.entity.Citizen;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = { CityMapper.class })
public interface CitizenMapper {

    @Mapping(target = "city", source = "cityDto")
    @Mapping(target = "citizenId", ignore = true)
    @Mapping(target = "createdOn", expression = "java(returnCurrentLocalDateTime())")
    Citizen mapToEntity(CitizenDto citizenDto);

    @Mapping(target = "cityDto", source = "city")
    CitizenDto mapToDto(Citizen citizen);

    default LocalDateTime returnCurrentLocalDateTime() {
        return LocalDateTime.now();
    }

}