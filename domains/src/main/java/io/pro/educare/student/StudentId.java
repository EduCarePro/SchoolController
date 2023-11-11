package io.pro.educare.student;

import io.pro.educare.Identify;
import io.pro.educare.school.School;
import io.pro.educare.school.SchoolID;

import java.util.Objects;
import java.util.UUID;

public class StudentId implements Identify<UUID> {
    private final UUID value;

    private StudentId(final UUID id) {
        this.value = Objects.requireNonNull(id);
    }

    public static StudentId from(final UUID value) {
        return new StudentId(value);
    }

    public static StudentId from(final Student student) {
        return new StudentId(student.getValue().getId());
    }

    public static StudentId unique() {
        return new StudentId(UUID.randomUUID());
    }

    @Override
    public UUID getId() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentId schoolID = (StudentId) o;
        return Objects.equals(value, schoolID.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
