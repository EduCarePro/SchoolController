package io.pro.educare.application.api.controllers;

import io.pro.educare.application.api.SchoolAPI;
import io.pro.educare.application.school.model.SchoolResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController implements SchoolAPI {
    @Override
    public SchoolResponse createSchool(SchoolNeo4jPersistence schoolMongoPersistence) {
        return null;
    }
}
