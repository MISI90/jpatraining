package pl.training.jpa.training;

import lombok.*;
import pl.training.jpa.commons.Identifiable;

import javax.persistence.*;

@Embeddable
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Duration {

    private Integer value;

    @Enumerated(EnumType.STRING)
    private DurationUnit unit;

}

