package pl.training.jpa.training;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TRAININGS")
@Getter
@Setter
@NoArgsConstructor
public class Training {

    @Id
    @GeneratedValue
    private Long id;

    private String code;

    private String title;

    private String slug;

    @OneToMany
    @JoinColumn(name = "PERSON_ID")
    private List<Person> authors;

    @OneToMany
    @JoinColumn(name = "TAG_ID")
    private List<Tag> tags;

    @Enumerated(EnumType.STRING)
    private Type type;

    @OneToOne
    @JoinColumn(name = "DURATION_ID")
    private Duration duration;

    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    private String description;

    @OneToMany
    @JoinColumn(name = "MODULE_ID")
    private List<Module> modules;

}
