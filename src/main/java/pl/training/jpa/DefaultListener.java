package pl.training.jpa;

import lombok.extern.java.Log;

import javax.persistence.PrePersist;

@Log
public class DefaultListener {

    @PrePersist
    public void prePersist(Object entity) {
        log.info("prePersist (default) " + entity);
    }

}
