package mu.elca.tax.processing.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AuditModel implements Serializable {

    @CreatedDate
    protected LocalDateTime createdOn;

    @LastModifiedDate
    protected LocalDateTime updatedOn;

}