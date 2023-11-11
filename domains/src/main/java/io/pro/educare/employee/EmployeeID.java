package io.pro.educare.employee;

import io.pro.educare.Identify;
import io.pro.educare.school.School;
import io.pro.educare.school.SchoolID;

import java.util.Objects;
import java.util.UUID;

public class EmployeeID implements Identify<UUID> {
  private final UUID value;

  private EmployeeID(final UUID id) {
    this.value = Objects.requireNonNull(id);
  }

  public static EmployeeID from(final UUID value) {
    return new EmployeeID(value);
  }

  public static EmployeeID from(final Employee aSchool) {
    return new EmployeeID(aSchool.getId().getValue());
  }

  public static EmployeeID unique() {
    return new EmployeeID(UUID.randomUUID());
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EmployeeID employeeID = (EmployeeID) o;
    return Objects.equals(value, employeeID.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public UUID getValue() {
    return value;
  }
}
