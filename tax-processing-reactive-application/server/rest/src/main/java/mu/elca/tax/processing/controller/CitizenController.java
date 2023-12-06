package mu.elca.tax.processing.controller;


import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.BodyInserters.fromValue;

import lombok.RequiredArgsConstructor;
import mu.elca.tax.processing.dto.CitizenDto;
import mu.elca.tax.processing.entity.Citizen;
import mu.elca.tax.processing.service.CitizenService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/Citizen")
public class CitizenController {

    private final CitizenService citizenService;

    @PostMapping("/create")
    public Mono<ResponseEntity<HttpStatus>> createCitizen(@RequestBody Mono<CitizenDto> citizenDtoMono) {
        return citizenService.createCitizen(citizenDtoMono)
                .map(ctzDtoMono -> new ResponseEntity<>(HttpStatus.OK));
    }

    @GetMapping("/getAllCitizens")
    public Flux<Citizen> getAllCitizens() {
        return citizenService.getAllCitizens();
    }
}
