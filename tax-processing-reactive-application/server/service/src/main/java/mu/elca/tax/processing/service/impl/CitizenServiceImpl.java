package mu.elca.tax.processing.service.impl;

import java.util.UUID;

import lombok.RequiredArgsConstructor;
import mu.elca.tax.processing.dto.CitizenDto;
import mu.elca.tax.processing.entity.Citizen;
import mu.elca.tax.processing.mapper.CitizenMapper;
import mu.elca.tax.processing.repository.CitizenRepository;
import mu.elca.tax.processing.service.CitizenService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CitizenServiceImpl implements CitizenService {

    private final CitizenMapper citizenMapper;

    private final CitizenRepository citizenRepository;

    @Override
    public Mono<CitizenDto> createCitizen(CitizenDto citizenDto) {
        Citizen citizen = citizenMapper.mapToEntity(citizenDto);
        return citizenRepository.save(citizen)
                .map(savedCitizen -> citizenMapper.mapToDto(savedCitizen));
    }

}