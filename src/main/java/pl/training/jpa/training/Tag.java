package pl.training.jpa.training;

import com.sun.istack.NotNull;
import lombok.*;
import pl.training.jpa.commons.Identifiable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Tag implements Identifiable<Long> {
    @Id
    private Long id;
    @NotNull
    private String name;
}
