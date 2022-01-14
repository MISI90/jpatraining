package pl.training.jpa.payments.repository;

import lombok.RequiredArgsConstructor;
import pl.training.jpa.commons.TransactionTemplate;
import pl.training.jpa.training.Training;

import java.util.Optional;

@RequiredArgsConstructor
public class JpaTrainingRepository {

    private final TransactionTemplate transactionTemplate;

    public Training save(Training training) {
        return transactionTemplate.withTransaction(entityManager -> {
            entityManager.persist(training);
            return training;
        });
    }

    public Optional<Training> getBySlug(String slug) {
        return transactionTemplate.withTransaction(entityManager -> Optional.ofNullable(entityManager.find(Training.class, slug)));
    }

}
