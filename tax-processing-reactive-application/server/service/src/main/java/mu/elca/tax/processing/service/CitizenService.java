package mu.elca.tax.processing.service;

import mu.elca.tax.processing.dto.CitizenDto;
import mu.elca.tax.processing.entity.Citizen;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CitizenService {

    Mono<CitizenDto> createCitizen(Mono<CitizenDto> citizenDto);
    Flux<Citizen> getAllCitizens();

}