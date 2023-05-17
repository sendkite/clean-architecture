package com.sendkite.autotil.core.retrospective.application;

import com.sendkite.autotil.core.retrospective.application.dto.RetrospectiveDto;

import java.util.List;
import java.util.Optional;

public interface RetrospectiveFinder {

    List<RetrospectiveDto> findAll();

    Optional<RetrospectiveDto> findById(Long retrospectiveId);

}
