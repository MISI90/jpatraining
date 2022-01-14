package pl.training.jpa.training;


import lombok.*;
import pl.training.jpa.commons.Identifiable;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Person implements Identifiable<Long> {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    @ElementCollection
    @Column(name = "email")
    @CollectionTable(name = "Person_email", joinColumns = @JoinColumn(name = "person_id"))
    private Set<String> email = new LinkedHashSet<>();

}
