package com.vladimir.service;

import com.vladimir.model.TestEntity;

import java.util.List;
import java.util.UUID;

public interface TestEntityService {
    void addTestEntity(TestEntity testEntity);
    void updateTestEntity(TestEntity testEntity);
    List<TestEntity> allTestEntity();
    void deleteTestEntity(UUID id);

    TestEntity findTestEntitiesById(UUID id);

}
