package io.pro.educare.application.employer.retriver.get;

import io.pro.educare.address.AddressID;
import io.pro.educare.employee.Employee;
import io.pro.educare.role.RoleGroup;
import io.pro.educare.school.SchoolID;
import io.pro.educare.transport.Transport;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public record EmployerOutput(
        UUID id,
        String name,
        String email,
        Transport transport,
        String telephone,
        String password,
        String numberOfCountrySerial,
        SchoolID schoolID,
        LocalDate dateOfBirth,
        AddressID addressID,
        RoleGroup roleGroup,
        LocalDateTime createdAt,
        LocalDateTime updateAt,
        LocalDateTime deletedAt
) {
    public static EmployerOutput from(
            Employee employee
    ) {
        return new EmployerOutput(
                employee.getId(),
                employee.getName(),
                employee.getEmail(),
                employee.getTransport(),
                employee.getTelephone(),
                employee.getPassword(),
                employee.getNumberOfCountrySerial(),
                employee.getSchoolID(),
                employee.getDateOfBirth(),
                employee.getAddressID(),
                employee.getRoleGroup(),
                employee.getCreatedAt(),
                employee.getUpdateAt(),
                employee.getDeletedAt()
        );
    }
}