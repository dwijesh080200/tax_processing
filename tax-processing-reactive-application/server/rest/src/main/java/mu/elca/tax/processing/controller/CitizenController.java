package mu.elca.tax.processing.controller;


import lombok.RequiredArgsConstructor;
import mu.elca.tax.processing.dto.CitizenDto;
import mu.elca.tax.processing.service.CitizenService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/Citizen")
public class CitizenController {

    private final CitizenService citizenService;

    @PostMapping("/create")
    public Mono<ResponseEntity<CitizenDto>> createCitizen(@RequestBody Mono<CitizenDto> citizenDtoMono) {
        return citizenDtoMono
                .flatMap(citizenService::createCitizen)
                .map(createdCitizen -> ResponseEntity.status(HttpStatus.CREATED).body(createdCitizen))
                .defaultIfEmpty(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
}
