package mu.elca.tax.processing.service.impl;

import lombok.RequiredArgsConstructor;
import mu.elca.tax.processing.dto.CitizenDto;
import mu.elca.tax.processing.service.CitizenService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CitizenServiceImpl implements CitizenService {
    @Override
    public Mono<CitizenDto> createCitizen(CitizenDto citizenDto) {
        return null;
    }
}