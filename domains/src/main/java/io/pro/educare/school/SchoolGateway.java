package io.pro.educare.school;

import io.pro.educare.Pagination;
import io.pro.educare.SearchQuery;

import java.util.Optional;
import java.util.UUID;

public interface SchoolGateway {
    Optional<School> findById(UUID id);

    School create(School school);

    void deleteById(UUID id);

    Pagination<School> findAll(SearchQuery searchQuery);
}
