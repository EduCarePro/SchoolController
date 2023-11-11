package io.pro.educare.application.school.persistence;

import io.pro.educare.address.Address;
import io.pro.educare.school.School;
import io.pro.educare.school.SchoolID;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.UUID;

@Node("school")
public class SchoolNeo4jEntity {
  @Id
  private UUID id;
  private LinkedHashSet<String> telephone;
  private Address address;
  private String numberOfCountrySerial;
  private LinkedHashSet<String> email;
  private String name;
  private Boolean isActivate;
  private Instant createdAt;
  private Instant updatedAt;
  private Instant deletedAt;

  public SchoolNeo4jEntity() {

  }

  public SchoolNeo4jEntity(
    UUID id,
    LinkedHashSet<String> telephone,
    Address address,
    String numberOfCountrySerial,
    LinkedHashSet<String> email,
    String name,
    Boolean isActivate,
    Instant createdAt,
    Instant updatedAt,
    Instant deletedAt
  ) {
    this.id = id;
    this.telephone = telephone;
    this.address = address;
    this.numberOfCountrySerial = numberOfCountrySerial;
    this.email = email;
    this.name = name;
    this.isActivate = isActivate;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.deletedAt = deletedAt;
  }

  public static SchoolNeo4jEntity from(School school) {
    return new SchoolNeo4jEntity(
      school.getId().getValue(),
      school.getTelephone(),
      school.getAddress(),
      school.getNumberOfCountrySerial(),
      school.getEmail(),
      school.getName(),
      school.getActivate(),
      school.getCreatedAt(),
      school.getUpdatedAt(),
      school.getDeletedAt()
    );
  }

  public School toAggregate() {
    return School.with(
      SchoolID.from(this.getId()),
      this.getAddress(),
      this.getTelephone(),
      this.getNumberOfCountrySerial(),
      this.getName(),
      this.getEmail(),
      this.getActivate(),
      this.getCreatedAt(),
      this.getUpdatedAt(),
      this.getDeletedAt()
    );
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public LinkedHashSet<String> getTelephone() {
    return telephone;
  }

  public void setTelephone(LinkedHashSet<String> telephone) {
    this.telephone = telephone;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public String getNumberOfCountrySerial() {
    return numberOfCountrySerial;
  }

  public void setNumberOfCountrySerial(String numberOfCountrySerial) {
    this.numberOfCountrySerial = numberOfCountrySerial;
  }

  public LinkedHashSet<String> getEmail() {
    return email;
  }

  public void setEmail(LinkedHashSet<String> email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getActivate() {
    return isActivate;
  }

  public void setActivate(Boolean activate) {
    isActivate = activate;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Instant getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(Instant deletedAt) {
    this.deletedAt = deletedAt;
  }
}
