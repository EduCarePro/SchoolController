package io.pro.educare.role;

import java.time.Instant;
import java.util.LinkedHashSet;

public class RoleGroup {
  private LinkedHashSet<Role> roles;
  private Boolean isActive;
  private Instant createdAt;
  private Instant updatedAt;
  private Instant deletedAt;

  private RoleGroup(final LinkedHashSet<Role> roles) {
    this.roles = roles;
  }
}
