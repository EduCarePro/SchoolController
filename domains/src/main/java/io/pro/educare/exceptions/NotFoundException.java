package io.pro.educare.exceptions;

import io.pro.educare.AggregateRoot;
import io.pro.educare.Entity;
import io.pro.educare.NotNull;
import io.pro.educare.Identify;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class NotFoundException extends DomainException {

    protected NotFoundException(@NotNull String message, final List<Error> anErrors) {
        super(message, anErrors);
    }

    public static NotFoundException with(
            final Class<? extends AggregateRoot> entity,
            final Identify<UUID> id
    ) {
        final var anError = "%s with ID %s was not found".formatted(
                entity.getSimpleName(),
                id.getId()
        );
        return new NotFoundException(anError, Collections.emptyList());
    }
}
