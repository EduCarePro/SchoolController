package io.pro.educare.school;

import io.pro.educare.AggregateRoot;
import io.pro.educare.address.Address;
import io.pro.educare.notifications.Notification;
import io.pro.educare.notifications.NotificationHandler;

import java.time.*;
import java.util.LinkedHashSet;

public class School extends AggregateRoot<SchoolID> {

    private LinkedHashSet<String> telephone;
    private Address address;
    private String numberOfCountrySerial;
    private LinkedHashSet<String> email;
    private String name;
    private Boolean isActivate;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;

    private School(SchoolID id, Address address, LinkedHashSet<String> telephone, String numberOfCountySerial, String name, LinkedHashSet<String> email, Boolean isActivate, Instant createdAt, Instant updatedAt, Instant deletedAt) {
        super(id);
        this.address = address;
        this.telephone = telephone;
        this.numberOfCountrySerial = numberOfCountySerial;
        this.name = name;
        this.email = email;
        this.isActivate = isActivate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public School update(
            final Address address,
            final LinkedHashSet<String> telephone,
            final String numberOfCountySerial,
            final String name,
            final LinkedHashSet<String> email,
            final Boolean isActive
    ) {
        final var now = Instant.now();
        if (isActive) {
            activate();
        } else deactivate();

        this.address = address;
        this.telephone = telephone;
        this.numberOfCountrySerial = numberOfCountySerial;
        this.name = name;
        this.email = email;
        return this;
    }

    public static School newSchool(
            final Address address,
            final LinkedHashSet<String> telephone,
            final String numberOfCountySerial,
            final String name,
            final LinkedHashSet<String> email,
            final Boolean isActivate
    ) {
        final var id = SchoolID.unique();
        final var now = Instant.now();
        return new School(
                id,
                address,
                telephone,
                numberOfCountySerial,
                name,
                email,
                isActivate,
                now,
                now,
                isActivate ? null : now
        );
    }

    public static School with(
            final SchoolID id,
            final Address address,
            final LinkedHashSet<String> telephone,
            final String numberOfCountySerial,
            final String name,
            final LinkedHashSet<String> email,
            final Boolean isActivate,
            final Instant createdAt,
            final Instant updatedAt,
            final Instant deletedAt) {
        return new School(
                id,
                address,
                telephone,
                numberOfCountySerial,
                name,
                email,
                isActivate,
                createdAt,
                updatedAt,
                deletedAt
        );
    }

    public void activate() {
        isActivate = true;
        updatedAt = Instant.now();
        deletedAt = null;
    }

    public void deactivate() {
        isActivate = false;
        updatedAt = Instant.now();
        deletedAt = Instant.now();
    }


    @Override
    public void validator(Notification notification) {
        new SchoolValidator(this, notification).validator();
    }

    public LinkedHashSet<String> getTelephone() {
        return telephone;
    }

    public Address getAddress() {
        return address;
    }

    public String getNumberOfCountrySerial() {
        return numberOfCountrySerial;
    }

    public LinkedHashSet<String> getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }


    public Boolean getActivate() {
        return isActivate;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public Instant getDeletedAt() {
        return deletedAt;
    }
}
