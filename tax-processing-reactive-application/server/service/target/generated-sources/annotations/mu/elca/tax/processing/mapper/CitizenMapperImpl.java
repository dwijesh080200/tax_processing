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
    date = "2023-12-06T08:43:39+0400",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.9 (BellSoft)"
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
        citizen.setFirstName( citizenDto.firstName() );
        citizen.setLastName( citizenDto.lastName() );
        citizen.setNationalId( citizenDto.nationalId() );

        citizen.setCreatedOn( returnCurrentLocalDateTime() );

        return citizen;
    }

    @Override
    public CitizenDto mapToDto(Citizen citizen) {
        if ( citizen == null ) {
            return null;
        }

        CityDto cityDto = null;
        String firstName = null;
        String lastName = null;
        String nationalId = null;

        cityDto = cityMapper.mapToDto( citizen.getCity() );
        firstName = citizen.getFirstName();
        lastName = citizen.getLastName();
        nationalId = citizen.getNationalId();

        UUID id = null;

        CitizenDto citizenDto = new CitizenDto( id, firstName, lastName, cityDto, nationalId );

        return citizenDto;
    }
}
