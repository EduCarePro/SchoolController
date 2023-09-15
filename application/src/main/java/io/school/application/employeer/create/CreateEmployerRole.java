package io.school.application.employeer.create;

import io.school.address.AddressID;
import io.school.role.RoleGroup;
import io.school.school.SchoolID;
import io.school.transport.Transport;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record CreateEmployerRole(

        String name,
        String email,
        String password,
        Transport transport,
        SchoolID schoolID,
        String telephone,
        AddressID addressID,
        String numberOfCountrySerial,
        RoleGroup roleGroup,
        LocalDate dateOfBirth,
        LocalDateTime createdAt,
        LocalDateTime updateAt,
        LocalDateTime deletedAt
) {
    public static CreateEmployerRole with(
            String name,
            Transport transport,
            String email,
            String password,
            SchoolID schoolID,
            String telephone,
            String numberOfCountrySerial,
            AddressID addressID,
            RoleGroup roleGroup,
            LocalDate dateOfBirth,
            LocalDateTime createdAt,
            LocalDateTime updateAt,
            LocalDateTime deletedAt
    ) {
        return new CreateEmployerRole(name, email, password, transport, schoolID, telephone, addressID, numberOfCountrySerial, roleGroup, dateOfBirth, createdAt, updateAt, deletedAt);
    }
}