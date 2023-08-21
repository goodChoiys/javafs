package EndGame.TeamPj.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="car")
@Getter
@Setter
@ToString
public class Car {

    @Id
    @Column(name="car_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;









}
