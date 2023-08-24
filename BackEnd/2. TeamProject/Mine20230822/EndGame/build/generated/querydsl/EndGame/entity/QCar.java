package EndGame.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCar is a Querydsl query type for Car
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCar extends EntityPathBase<Car> {

    private static final long serialVersionUID = 1101999210L;

    public static final QCar car = new QCar("car");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath brand = createString("brand");

    public final StringPath carDetail = createString("carDetail");

    public final StringPath carName = createString("carName");

    public final EnumPath<EndGame.config.CarSellStatus> carSellStatus = createEnum("carSellStatus", EndGame.config.CarSellStatus.class);

    public final StringPath color = createString("color");

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> manufacture = createNumber("manufacture", Integer.class);

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regTime = _super.regTime;

    public final NumberPath<Integer> stockNumber = createNumber("stockNumber", Integer.class);

    public final StringPath type = createString("type");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public QCar(String variable) {
        super(Car.class, forVariable(variable));
    }

    public QCar(Path<? extends Car> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCar(PathMetadata metadata) {
        super(Car.class, metadata);
    }

}

