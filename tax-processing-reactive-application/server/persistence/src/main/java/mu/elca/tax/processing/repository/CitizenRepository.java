package mu.elca.tax.processing.repository;

import java.util.UUID;

import mu.elca.tax.processing.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen, UUID> {

}