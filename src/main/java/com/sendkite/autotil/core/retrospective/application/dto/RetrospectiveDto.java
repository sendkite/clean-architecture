package com.sendkite.autotil.core.retrospective.application.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sendkite.autotil.core.retrospective.domain.Retrospective;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class RetrospectiveDto {
    private Long id;
    private String wellDone;
    private String improvement;
    private String actionItem;
    private String comment;
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime createdDateTime;
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime lastModifiedDateTime;

    public static RetrospectiveDto ofEntity(Retrospective entity) {
        RetrospectiveDto retrospectiveDto = new RetrospectiveDto();
        retrospectiveDto.id = entity.getId();
        retrospectiveDto.wellDone = entity.getWellDone();
        retrospectiveDto.improvement = entity.getImprovement();
        retrospectiveDto.actionItem = entity.getActionItem();
        retrospectiveDto.comment = entity.getComment();
        retrospectiveDto.createdDateTime = entity.getCreatedDateTime();
        retrospectiveDto.lastModifiedDateTime = entity.getLastModifiedDateTime();
        return retrospectiveDto;
    }
}
