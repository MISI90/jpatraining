package pl.training.jpa.training;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Module {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String description;

    @Embedded
    private Duration duration;

    @OneToMany
    @JoinColumn(name = "SUBMODULE_ID")
    private List<Module> submodules;

}
