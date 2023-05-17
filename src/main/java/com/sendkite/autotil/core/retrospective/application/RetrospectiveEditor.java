package com.sendkite.autotil.core.retrospective.application;

import com.sendkite.autotil.core.retrospective.application.dto.RetrospectiveDto;
import com.sendkite.autotil.core.retrospective.application.dto.RetrospectiveRegisterCommand;

public interface RetrospectiveEditor {

    RetrospectiveDto save(RetrospectiveRegisterCommand registerCommand);
}
