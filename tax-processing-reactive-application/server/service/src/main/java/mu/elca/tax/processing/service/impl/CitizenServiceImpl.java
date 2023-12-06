package mu.elca.tax.processing.service.impl;

import lombok.RequiredArgsConstructor;
import mu.elca.tax.processing.dto.CitizenDto;
import mu.elca.tax.processing.entity.Citizen;
import mu.elca.tax.processing.mapper.CitizenMapper;
import mu.elca.tax.processing.repository.CitizenRepository;
import mu.elca.tax.processing.service.CitizenService;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CitizenServiceImpl implements CitizenService {

    private final CitizenMapper citizenMapper;

    private final CitizenRepository citizenRepository;

    @Override
    public Mono<CitizenDto> createCitizen(Mono<CitizenDto> citizenDto) {
        return citizenDto.doOnNext(c -> citizenRepository.save(citizenMapper.mapToEntity(c)).subscribe());
    }

    @Override
    public Flux<Citizen> getAllCitizens() {
        return citizenRepository.findAll();
    }

}