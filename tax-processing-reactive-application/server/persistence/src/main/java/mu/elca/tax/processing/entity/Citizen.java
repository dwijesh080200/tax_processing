package mu.elca.tax.processing.entity;

import java.util.Objects;
import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Persistence;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Data
@Table("Citizen")
@NoArgsConstructor
public class Citizen extends AuditModel {

    @Id
    @Column("CITIZENID")
    private UUID citizenId;

    @Column("FIRSTNAME")
    private String firstName;

    @Column("LASTNAME")
    private String lastName;

    @Column("CITY")
    private City city;

    @Column("NATIONALID")
    private String nationalId;
}