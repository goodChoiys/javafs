package EndGame.TeamPj.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchDto {

    private String type; //차종
    private String country; //국가구분 국산/수입
    private Integer year; //연식
    private Integer mileage; //주행거리
    private Integer price; //가격
    private String color; //색상
    private String option; //옵션
    private String location; //지역
    private String fuel; //연료
    private String transmission; //변속기 수동/자동
    private String accident; //사고이력
    private Integer seater; //인승



}
