package mu.elca.tax.processing.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCitizen is a Querydsl query type for Citizen
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCitizen extends EntityPathBase<Citizen> {

    private static final long serialVersionUID = 284423442L;

    public static final QCitizen citizen = new QCitizen("citizen");

    public final QAuditModel _super = new QAuditModel(this);

    public final EnumPath<City> city = createEnum("city", City.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdOn = _super.createdOn;

    public final StringPath firstName = createString("firstName");

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final StringPath lastName = createString("lastName");

    public final StringPath nationalId = createString("nationalId");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedOn = _super.updatedOn;

    public QCitizen(String variable) {
        super(Citizen.class, forVariable(variable));
    }

    public QCitizen(Path<? extends Citizen> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCitizen(PathMetadata metadata) {
        super(Citizen.class, metadata);
    }

}

