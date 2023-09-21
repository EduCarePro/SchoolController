package io.pro.educare.school;

import io.pro.educare.Entity;
import io.pro.educare.Production;
import io.pro.educare.address.Address;
import io.pro.educare.address.AddressID;
import io.pro.educare.notifications.NotificationHandler;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.LinkedHashSet;
import java.util.UUID;

@Production(Production.Stage.IN_PRODUCTION)
public class School extends Entity<UUID> {
    protected UUID id;
    protected String password;
    protected LinkedHashSet<String> telephone;
    protected Address address;
    protected String numberOfCountrySerial;
    protected LinkedHashSet<String> email;
    protected String name;
    protected boolean isActivate;
    protected Instant createdAt;
    protected Instant updatedAt;
    protected Instant deletedAt;

    public School() {
    }

    public School update(Address address, String password, LinkedHashSet<String> telephone, String numberOfCountySerial, String name, LinkedHashSet<String> email) {
        this.setAddress(address);
        this.setNumberOfCountrySerial(numberOfCountySerial);
        this.setName(name);
        this.setEmail(email);
        this.updatedAt = LocalDateTime.now().atOffset(ZoneOffset.of(address.getCountry().getAlpha2Code())).toInstant();
        return this;
    }

    public static School newSchool(Address address, String password, LinkedHashSet<String> telephone, String numberOfCountySerial, String name, LinkedHashSet<String> email, boolean isActivate) {
        return new School(address, password, telephone, numberOfCountySerial, name, email, isActivate);
    }

    public School(Address address, String password, LinkedHashSet<String> telephone, String numberOfCountySerial, String name, LinkedHashSet<String> email, boolean isActivate) {
        this.address = address;
        this.password = password;
        this.telephone = telephone;
        this.numberOfCountrySerial = numberOfCountySerial;
        this.name = name;
        this.email = email;
        this.isActivate = isActivate;
        this.createdAt = LocalDateTime.now().atOffset(ZoneOffset.of(address.getCountry().getAlpha2Code())).toInstant();
        this.updatedAt = LocalDateTime.now().atOffset(ZoneOffset.of(address.getCountry().getAlpha2Code())).toInstant();
    }

    public void validator(NotificationHandler notificationHandler) {
        new SchoolValid(this, notificationHandler);
    }

    public LinkedHashSet<String> getTelephone() {
        return telephone;
    }

    public boolean getIsActivate() {
        return isActivate;
    }

    public void setActivate(boolean activate) {
        isActivate = activate;
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


    public void setTelephone(LinkedHashSet<String> telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LinkedHashSet<String> getEmail() {
        return email;
    }

    public void setEmail(LinkedHashSet<String> email) {
        this.email = email;
    }

    public UUID getId() {
        return id;
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

    public void setNumberOfCountrySerial(String cnpj) {
        this.numberOfCountrySerial = cnpj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
