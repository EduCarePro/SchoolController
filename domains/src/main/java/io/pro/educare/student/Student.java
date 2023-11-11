package io.pro.educare.student;

import io.pro.educare.AggregateRoot;
import io.pro.educare.address.Address;
import io.pro.educare.transport.Transport;
import io.pro.educare.school.SchoolID;

import java.time.Instant;
import java.time.LocalDate;

public class Student extends AggregateRoot<StudentId> {
    private String name;
    private String email;
    private Transport transport;
    private String telephone;
    private String numberOfCountrySerial;
    private SchoolID schoolID;
    private LocalDate dateOfBirth;
    private Address address;
    private Boolean isActive;
    private Instant createdAt;
    private Instant updateAt;
    private Instant deletedAt;


    private Student(
            final String name,
            final String email,
            final Transport transport,
            final String telephone,
            final String numberOfCountrySerial,
            final SchoolID schoolID,
            final LocalDate dateOfBirth,
            final Address address,
            final Boolean isActive,
            final Instant createdAt,
            final Instant updateAt,
            final Instant deletedAt
    ) {
        this.name = name;
        this.email = email;
        this.transport = transport;
        this.telephone = telephone;
        this.numberOfCountrySerial = numberOfCountrySerial;
        this.schoolID = schoolID;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.isActive = isActive;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.deletedAt = deletedAt;
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
