package pl.training.jpa.payments.repository;

import lombok.RequiredArgsConstructor;
import pl.training.jpa.commons.TransactionTemplate;
import pl.training.jpa.training.TrainingsCollection;

import java.util.List;

@RequiredArgsConstructor
public class JpaTrainingsCollectionRepository {

    private final TransactionTemplate transactionTemplate;

    public List<TrainingsCollection> getAll() {
        return transactionTemplate.withTransaction(entityManager -> entityManager.createQuery("select tc from TrainingsCollection tc").getResultList());
    }

}
