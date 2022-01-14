package pl.training.jpa.training;

import lombok.*;
import pl.training.jpa.commons.Identifiable;

import javax.persistence.*;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Duration implements Identifiable<Long> {
    @Id
    @GeneratedValue
    private Long id;
    private Integer value;
    @Enumerated(EnumType.STRING)
    private DurationUnit unit;


}
