package mu.elca.tax.processing.dto;

import java.util.UUID;

public record CitizenDto(UUID id, String firstName, String lastName, CityDto cityDto, String nationalId) {
}