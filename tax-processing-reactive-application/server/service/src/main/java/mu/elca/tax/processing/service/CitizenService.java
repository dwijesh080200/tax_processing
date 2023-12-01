package mu.elca.tax.processing.service;

import mu.elca.tax.processing.dto.CitizenDto;
import reactor.core.publisher.Mono;

public interface CitizenService {

    Mono<CitizenDto> createCitizen(CitizenDto citizenDto);

}