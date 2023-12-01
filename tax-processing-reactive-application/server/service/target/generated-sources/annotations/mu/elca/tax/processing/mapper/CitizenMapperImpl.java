package mu.elca.tax.processing.mapper;

import java.util.UUID;
import javax.annotation.processing.Generated;
import mu.elca.tax.processing.dto.CitizenDto;
import mu.elca.tax.processing.dto.CityDto;
import mu.elca.tax.processing.entity.Citizen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-01T21:44:21+0400",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Amazon.com Inc.)"
)
@Component
public class CitizenMapperImpl implements CitizenMapper {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public Citizen mapToEntity(CitizenDto citizenDto) {
        if ( citizenDto == null ) {
            return null;
        }

        Citizen citizen = new Citizen();

        citizen.setCity( cityMapper.mapToEntity( citizenDto.cityDto() ) );
        citizen.setId( citizenDto.id() );
        citizen.setFirstName( citizenDto.firstName() );
        citizen.setLastName( citizenDto.lastName() );
        citizen.setNationalId( citizenDto.nationalId() );

        return citizen;
    }

    @Override
    public CitizenDto mapToDto(Citizen citizen) {
        if ( citizen == null ) {
            return null;
        }

        CityDto cityDto = null;
        UUID id = null;
        String firstName = null;
        String lastName = null;
        String nationalId = null;

        cityDto = cityMapper.mapToDto( citizen.getCity() );
        id = citizen.getId();
        firstName = citizen.getFirstName();
        lastName = citizen.getLastName();
        nationalId = citizen.getNationalId();

        CitizenDto citizenDto = new CitizenDto( id, firstName, lastName, cityDto, nationalId );

        return citizenDto;
    }
}
