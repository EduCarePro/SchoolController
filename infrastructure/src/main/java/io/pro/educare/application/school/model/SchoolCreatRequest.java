package io.pro.educare.application.school.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.pro.educare.address.Address;

import java.util.LinkedHashSet;

public record SchoolCreatRequest(
  @JsonProperty("telephone") LinkedHashSet<String> telephone,
  @JsonProperty("address") Address address,
  @JsonProperty("number_of_country_serial") String numberOfCountrySerial,
  @JsonProperty("email") LinkedHashSet<String> email,
  @JsonProperty("name") String name,
  @JsonProperty("is_active") Boolean isActivate
) {
}
