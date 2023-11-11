package io.pro.educare.application.school.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.pro.educare.address.Address;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.UUID;

public record SchoolListResponse(
  @JsonProperty("id") UUID id,
  @JsonProperty("telephone") LinkedHashSet<String> telephone,
  @JsonProperty("address") Address address,
  @JsonProperty("number_of_country_serial") String numberOfCountrySerial,
  @JsonProperty("email") LinkedHashSet<String> email,
  @JsonProperty("name") String name,
  @JsonProperty("is_active") Boolean isActivate,
  @JsonProperty("created_at") Instant createdAt,
  @JsonProperty("updated_at") Instant updatedAt,
  @JsonProperty("deleted_at") Instant deletedAt
) {
}
