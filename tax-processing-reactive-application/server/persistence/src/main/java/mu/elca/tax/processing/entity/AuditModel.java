package mu.elca.tax.processing.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Column;

@Getter
@Setter
public class AuditModel implements Serializable {

    @CreatedDate
    @Column("created_on")
    protected LocalDateTime createdOn;
}