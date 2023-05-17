package com.sendkite.autotil.core.retrospective.application.dto;

import com.sendkite.autotil.core.retrospective.domain.Retrospective;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;

@Getter
public class RetrospectiveRegisterCommand {
    private String wellDone;
    private String improvement;
    private String actionItem;
    private String comment;

    public static RetrospectiveRegisterCommand create(
            @NotEmpty String wellDone,
            @NotEmpty String improvement,
            @NotEmpty String actionItem,
            String comment
    ) {

        RetrospectiveRegisterCommand registerCommand = new RetrospectiveRegisterCommand();
        registerCommand.wellDone = wellDone;
        registerCommand.improvement = improvement;
        registerCommand.actionItem = actionItem;
        registerCommand.comment = comment;
        return registerCommand;
    }

    public Retrospective convertToEntity() {
        return Retrospective.create(getWellDone(), getImprovement(), getActionItem(), getComment());
    }
}
