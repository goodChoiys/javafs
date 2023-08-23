package EndGame.TeamPj.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CarDto {
    private Long id;
    private String itemNm;
    private Integer price;
    private String itemDetail;
    private String sellStatus;
    private LocalDateTime regTime;
    private LocalDateTime updateTime;





}
