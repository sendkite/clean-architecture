package com.sendkite.autotil.core.retrospective.application;

import com.sendkite.autotil.core.retrospective.application.dto.RetrospectiveDto;
import com.sendkite.autotil.core.retrospective.application.dto.RetrospectiveRegisterCommand;
import com.sendkite.autotil.core.retrospective.domain.RetrospectiveRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RetrospectiveManager implements RetrospectiveEditor, RetrospectiveFinder {

    private final RetrospectiveRepository retrospectiveRepository;

    public RetrospectiveManager(RetrospectiveRepository retrospectiveRepository) {
        this.retrospectiveRepository = retrospectiveRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<RetrospectiveDto> findAll() {
        return retrospectiveRepository.findAll().stream()
                .map(RetrospectiveDto::ofEntity)
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<RetrospectiveDto> findById(Long retrospectiveId) {
        return retrospectiveRepository.findById(retrospectiveId)
                .map(RetrospectiveDto::ofEntity);
    }

    @Override
    @Transactional
    public RetrospectiveDto save(RetrospectiveRegisterCommand registerCommand) {
        // TODO : 이미 존재하는지 확인
        return RetrospectiveDto.ofEntity(retrospectiveRepository.save(registerCommand.convertToEntity()));
    }
}
