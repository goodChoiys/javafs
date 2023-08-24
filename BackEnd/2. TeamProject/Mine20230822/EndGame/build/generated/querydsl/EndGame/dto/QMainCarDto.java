package EndGame.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * EndGame.dto.QMainCarDto is a Querydsl Projection type for MainCarDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QMainCarDto extends ConstructorExpression<MainCarDto> {

    private static final long serialVersionUID = 69233876L;

    public QMainCarDto(com.querydsl.core.types.Expression<Long> id, com.querydsl.core.types.Expression<String> type, com.querydsl.core.types.Expression<String> brand, com.querydsl.core.types.Expression<String> manufacture, com.querydsl.core.types.Expression<String> color) {
        super(MainCarDto.class, new Class<?>[]{long.class, String.class, String.class, String.class, String.class}, id, type, brand, manufacture, color);
    }

}

