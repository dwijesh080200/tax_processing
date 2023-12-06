package mu.elca.tax.processing.repository;

import java.util.UUID;

import mu.elca.tax.processing.entity.Citizen;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizenRepository extends ReactiveCrudRepository<Citizen, UUID> {

}