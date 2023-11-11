package io.pro.educare.employee;

import io.pro.educare.AggregateRoot;
import io.pro.educare.address.Address;
import io.pro.educare.notifications.Notification;
import io.pro.educare.notifications.NotificationHandler;
import io.pro.educare.role.RoleGroup;
import io.pro.educare.transport.Transport;
import io.pro.educare.school.SchoolID;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.UUID;

public class Employee extends AggregateRoot<EmployeeID> {

  private String name;
  private String email;
  private Transport transport;
  private String telephone;
  private String numberOfCountrySerial;
  private SchoolID schoolID;
  private LocalDate dateOfBirth;
  private Address address;
  private RoleGroup roleGroup;
  private Boolean isActive;
  private Instant createdAt;
  private Instant updateAt;
  private Instant deletedAt;

  private Employee(EmployeeID id, String name, String email, Transport transport, String telephone, String numberOfCountrySerial, SchoolID schoolID, LocalDate dateOfBirth, Address address, RoleGroup role, Boolean isActive, Instant createdAt, Instant updatedAt, Instant deletedAt) {
    super(id);
    this.name = name;
    this.email = email;
    this.transport = transport;
    this.telephone = telephone;
    this.numberOfCountrySerial = numberOfCountrySerial;
    this.schoolID = schoolID;
    this.dateOfBirth = dateOfBirth;
    this.address = address;
    this.roleGroup = role;
    this.isActive = isActive;
    this.createdAt = createdAt;
    this.updateAt = updatedAt;
    this.deletedAt = deletedAt;
  }

  public static Employee newEemployee(String name, String email, Transport transport, String telephone, String numberOfCountrySerial, SchoolID schoolID, LocalDate dateOfBirth, Address address, RoleGroup roleGroup, Boolean isActive) {
    final var id = EmployeeID.unique();
    final var now = Instant.now();
    final var deletedAt = isActive ? null : now;
    return new Employee(
      id,
      name,
      email,
      transport,
      telephone,
      numberOfCountrySerial,
      schoolID,
      dateOfBirth,
      address,
      roleGroup,
      isActive,
      now,
      now,
      deletedAt
    );
  }

  @Override
  public void validator(Notification notification) {
    new EmployeeValidate().validate(this, notification);
  }


  public Employee update(
    final String name,
    final String email,
    final Transport transport,
    final String telephone,
    final String numberOfCountrySerial,
    final SchoolID schoolID,
    final LocalDate dateOfBirth,
    final Address address,
    final RoleGroup role
  ) {
    if (isActive) {
      activate();
    } else deactivate();
    
    this.name = name;
    this.email = email;
    this.transport = transport;
    this.telephone = telephone;
    this.numberOfCountrySerial = numberOfCountrySerial;
    this.schoolID = schoolID;
    this.dateOfBirth = dateOfBirth;
    this.address = address;
    this.roleGroup = role;
    this.updateAt = Instant.now();
    return this;

  }

  public void activate() {
    this.isActive = true;
    this.updateAt = Instant.now();
    this.deletedAt = null;
  }

  public void deactivate() {
    this.isActive = false;
    this.updateAt = Instant.now();
    this.deletedAt = Instant.now();
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public Transport getTransport() {
    return transport;
  }

  public String getTelephone() {
    return telephone;
  }

  public String getNumberOfCountrySerial() {
    return numberOfCountrySerial;
  }

  public SchoolID getSchoolID() {
    return schoolID;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public Address getAddress() {
    return address;
  }

  public RoleGroup getRoleGroup() {
    return roleGroup;
  }

  public Boolean getActive() {
    return isActive;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public Instant getUpdateAt() {
    return updateAt;
  }

  public Instant getDeletedAt() {
    return deletedAt;
  }
}
