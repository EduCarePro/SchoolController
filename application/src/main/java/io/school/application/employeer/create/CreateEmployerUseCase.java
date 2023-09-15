package io.school.application.employeer.create;

import io.school.application.UseCase;
import io.vavr.control.Either;
import io.school.notifications.NotificationHandler;
public abstract class CreateEmployerUseCase implements UseCase<CreateEmployerRole, Either<NotificationHandler, CreateEmployerOutput>> {
}