package mu.elca.tax.processing.mapper;

import javax.annotation.processing.Generated;
import mu.elca.tax.processing.dto.CityDto;
import mu.elca.tax.processing.entity.City;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-01T21:44:21+0400",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Amazon.com Inc.)"
)
@Component
public class CityMapperImpl implements CityMapper {

    @Override
    public City mapToEntity(CityDto cityDto) {
        if ( cityDto == null ) {
            return null;
        }

        City city;

        switch ( cityDto ) {
            case VACOAS: city = City.VACOAS;
            break;
            case QUATRE_BORNES: city = City.QUATRE_BORNES;
            break;
            case CUREPIPE: city = City.CUREPIPE;
            break;
            case PORTLOUIS: city = City.PORTLOUIS;
            break;
            case STPIERRE: city = City.STPIERRE;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + cityDto );
        }

        return city;
    }

    @Override
    public CityDto mapToDto(City city) {
        if ( city == null ) {
            return null;
        }

        CityDto cityDto;

        switch ( city ) {
            case VACOAS: cityDto = CityDto.VACOAS;
            break;
            case QUATRE_BORNES: cityDto = CityDto.QUATRE_BORNES;
            break;
            case CUREPIPE: cityDto = CityDto.CUREPIPE;
            break;
            case PORTLOUIS: cityDto = CityDto.PORTLOUIS;
            break;
            case STPIERRE: cityDto = CityDto.STPIERRE;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + city );
        }

        return cityDto;
    }
}
