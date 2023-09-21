package io.pro.educare.application.employer.create;

import io.pro.educare.address.Address;
import io.pro.educare.address.AddressID;
import io.pro.educare.role.RoleGroup;
import io.pro.educare.school.SchoolID;
import io.pro.educare.transport.Transport;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record CreateEmployerRole(

        String name,
        String email,
        String password,
        Transport transport,
        SchoolID schoolID,
        String telephone,
        Address address,
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
            Address address,
            RoleGroup roleGroup,
            LocalDate dateOfBirth,
            LocalDateTime createdAt,
            LocalDateTime updateAt,
            LocalDateTime deletedAt
    ) {
        return new CreateEmployerRole(name, email, password, transport, schoolID, telephone, address, numberOfCountrySerial, roleGroup, dateOfBirth, createdAt, updateAt, deletedAt);
    }
}
