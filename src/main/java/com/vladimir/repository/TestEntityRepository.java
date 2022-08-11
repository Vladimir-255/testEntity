package com.vladimir.repository;

import com.vladimir.model.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TestEntityRepository extends JpaRepository<TestEntity, UUID> {
public TestEntity findTestEntitiesById(UUID id);
}
