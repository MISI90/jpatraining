package pl.training.jpa.training;

import lombok.*;
import pl.training.jpa.commons.Identifiable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Tag implements Identifiable<Long> {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String name;
}
