package com.sendkite.autotil.web.retrospective.dto;

import com.sendkite.autotil.core.retrospective.application.dto.RetrospectiveRegisterCommand;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;

@Getter
public class RetrospectiveRegisterRequest {
    @NotEmpty
    private String wellDone;
    @NotEmpty
    private String improvement;
    @NotEmpty
    private String actionItem;
    private String comment;

    public RetrospectiveRegisterCommand convertToRegisterCommand() {
        return RetrospectiveRegisterCommand.create(getWellDone(), getImprovement(), getActionItem(), getComment());
    }
}
