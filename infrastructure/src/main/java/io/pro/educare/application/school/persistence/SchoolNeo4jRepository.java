package io.pro.educare.application.school.persistence;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SchoolNeo4jRepository extends Neo4jRepository<SchoolNeo4jEntity, UUID> {
}
