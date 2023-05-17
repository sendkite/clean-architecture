package com.sendkite.autotil.web.retrospective;

import com.sendkite.autotil.core.retrospective.application.RetrospectiveEditor;
import com.sendkite.autotil.core.retrospective.application.RetrospectiveFinder;
import com.sendkite.autotil.core.retrospective.application.dto.RetrospectiveDto;
import com.sendkite.autotil.web.retrospective.dto.RetrospectiveRegisterRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RetrospectiveRestController {
    private final RetrospectiveFinder retrospectiveFinder;
    private final RetrospectiveEditor retrospectiveEditor;

    public RetrospectiveRestController(RetrospectiveFinder retrospectiveFinder, RetrospectiveEditor retrospectiveEditor) {
        this.retrospectiveFinder = retrospectiveFinder;
        this.retrospectiveEditor = retrospectiveEditor;
    }

    @GetMapping("/retrospectives")
    public ResponseEntity<List<RetrospectiveDto>> getRetrospectives() {
        return ResponseEntity.ok(retrospectiveFinder.findAll());
    }

    @PostMapping("/retrospectives")
    public RetrospectiveDto postRetrospectives(
            @RequestBody @Valid RetrospectiveRegisterRequest request
    ) {
        return retrospectiveEditor.save(request.convertToRegisterCommand());
    }
}
