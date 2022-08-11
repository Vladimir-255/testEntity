package com.vladimir.controller;

import com.vladimir.model.TestEntity;
import com.vladimir.service.TestEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/")
public class TestEntityController {

    TestEntityService testEntityService;

    @Autowired
    public TestEntityController(TestEntityService testEntityService) {
        this.testEntityService = testEntityService;
    }

    @GetMapping(value = "")
    public ResponseEntity<TestEntity> findUser(@PathVariable("id") UUID id){
        TestEntity testEntity = testEntityService.findTestEntitiesById(id);
        return ResponseEntity.ok().body(testEntity);
    }

    @PostMapping(value = "")
    public ResponseEntity<TestEntity> addUser(@RequestBody TestEntity testEntity){
       testEntityService.addTestEntity(testEntity);
        return ResponseEntity.ok(testEntity);
    }

    @PutMapping(value = "")
    public ResponseEntity<TestEntity> updateUser(@RequestBody TestEntity testEntity){
        testEntityService.updateTestEntity(testEntity);
        return ResponseEntity.ok(testEntity);
    }

    @DeleteMapping(value = "")
    public ResponseEntity<String> deleteUser(@PathVariable("id")UUID id){
        testEntityService.deleteTestEntity(id);
        return ResponseEntity.ok("ok");
    }

}
