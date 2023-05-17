package com.sendkite.autotil.core.retrospective.domain;

import java.util.List;
import java.util.Optional;

public interface RetrospectiveRepository {

    List<Retrospective> findAll();

    Optional<Retrospective> findById(Long id);

    Retrospective save(Retrospective retrospective);

    void delete(Retrospective retrospective);

    void deleteAll();
}
