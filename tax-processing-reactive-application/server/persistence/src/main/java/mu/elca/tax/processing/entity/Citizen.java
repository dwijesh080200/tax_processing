package mu.elca.tax.processing.entity;

import java.util.UUID;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Data
@Table("Citizen")
public class Citizen extends AuditModel {

    @Id
    private UUID id = UUID.randomUUID();

    @Column("FIRSTNAME")
    private String firstName;

    @Column("LASTNAME")
    private String lastName;

    @Column("CITY")
    private City city;

    @Column("NATIONALID")
    private String nationalId;

}