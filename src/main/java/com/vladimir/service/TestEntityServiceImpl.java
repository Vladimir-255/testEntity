package com.vladimir.service;

import com.vladimir.model.TestEntity;
import com.vladimir.repository.TestEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class TestEntityServiceImpl implements TestEntityService {

    TestEntityRepository testEntityRepository;

    @Autowired
    public TestEntityServiceImpl(TestEntityRepository testEntityRepository) {
        this.testEntityRepository = testEntityRepository;
    }

    @Transactional
    @Override
    public void addTestEntity(TestEntity testEntity) {
        testEntityRepository.save(testEntity);
    }

    @Transactional
    @Override
    public void updateTestEntity(TestEntity testEntity) {
        testEntityRepository.save(testEntity);
    }

    @Transactional
    @Override
    public List<TestEntity> allTestEntity() {
        return testEntityRepository.findAll();
    }

    @Transactional
    @Override
    public void deleteTestEntity(UUID id) {
        testEntityRepository.deleteById(id);
    }

    @Override
    public TestEntity findTestEntitiesById(UUID id) {
        return testEntityRepository.findTestEntitiesById(id);
    }
}
