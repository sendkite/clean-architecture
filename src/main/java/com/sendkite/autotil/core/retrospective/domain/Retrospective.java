package com.sendkite.autotil.core.retrospective.domain;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.util.Assert;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Entity
public class Retrospective {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String wellDone;
    private String improvement;
    private String actionItem;
    private String comment;

    private LocalDateTime createdDateTime;
    private LocalDateTime lastModifiedDateTime;

    private static void validateRetrospectiveArguments(String wellDone, String improvement, String actionItem) {
        Assert.hasText(wellDone, "wellDone 은 필수입력값입니다.");
        Assert.hasText(improvement, "improvement 는 필수입력값입니다.");
        Assert.hasText(actionItem, "actionItem 은 필수입력값입니다.");
    }

    public static Retrospective create(
            String wellDone,
            String improvement,
            String actionItem,
            String comment
    ) {
        validateRetrospectiveArguments(wellDone, improvement, actionItem);

        Retrospective retrospective = new Retrospective();
        retrospective.wellDone = wellDone;
        retrospective.improvement = improvement;
        retrospective.actionItem = actionItem;
        retrospective.comment = comment;
        retrospective.createdDateTime = LocalDateTime.now();
        retrospective.lastModifiedDateTime = retrospective.createdDateTime;

        return retrospective;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Retrospective that = (Retrospective) o;
        return Objects.equals(id, that.id) && Objects.equals(wellDone, that.wellDone) && Objects.equals(improvement, that.improvement) && Objects.equals(actionItem, that.actionItem) && Objects.equals(comment, that.comment) && Objects.equals(createdDateTime, that.createdDateTime) && Objects.equals(lastModifiedDateTime, that.lastModifiedDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, wellDone, improvement, actionItem, comment, createdDateTime, lastModifiedDateTime);
    }
}
