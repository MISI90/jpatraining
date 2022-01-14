package pl.training.jpa.training;

import lombok.*;
import pl.training.jpa.commons.Identifiable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class TrainingsCollection implements Identifiable<Long> {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;
    private String slug;

    @ManyToMany
    @JoinTable(name = "TrainingsCollection_trainings",
            joinColumns = @JoinColumn(name = "trainingsCollection_id"),
            inverseJoinColumns = @JoinColumn(name = "trainings_id"))
    private List<Training> trainings = new ArrayList<>();

    @PrePersist
    public void perPersist() {
        this.slug = this.name.toLowerCase().replace(' ', '_');
    }

}
