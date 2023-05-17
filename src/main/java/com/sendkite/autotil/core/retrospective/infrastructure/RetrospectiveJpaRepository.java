package com.sendkite.autotil.core.retrospective.infrastructure;

import com.sendkite.autotil.core.retrospective.domain.Retrospective;
import com.sendkite.autotil.core.retrospective.domain.RetrospectiveRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RetrospectiveJpaRepository extends RetrospectiveRepository, JpaRepository<Retrospective, Long> {
}
