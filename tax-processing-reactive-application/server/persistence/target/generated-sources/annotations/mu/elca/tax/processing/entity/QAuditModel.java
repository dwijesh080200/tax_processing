package mu.elca.tax.processing.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditModel is a Querydsl query type for AuditModel
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QAuditModel extends EntityPathBase<AuditModel> {

    private static final long serialVersionUID = 1452690980L;

    public static final QAuditModel auditModel = new QAuditModel("auditModel");

    public final DateTimePath<java.time.LocalDateTime> createdOn = createDateTime("createdOn", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> updatedOn = createDateTime("updatedOn", java.time.LocalDateTime.class);

    public QAuditModel(String variable) {
        super(AuditModel.class, forVariable(variable));
    }

    public QAuditModel(Path<? extends AuditModel> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditModel(PathMetadata metadata) {
        super(AuditModel.class, metadata);
    }

}

