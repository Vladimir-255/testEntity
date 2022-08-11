package com.vladimir.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class TestEntity {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @Column
    private UUID documentId;

    @Column
    private String documentDate;

    @Column
    private UUID dictionaryValueId;

    @Column
    private UUID getDictionaryValueName;

    @Column
    private String sortOrder;

    @Column
    private UUID testId;

    @Column
    private String testName;

    public TestEntity() {
    }


    public TestEntity(UUID documentId, String documentDate, UUID dictionaryValueId, UUID getDictionaryValueName, String sortOrder, UUID testId, String testName) {
        this.documentId = documentId;
        this.documentDate = documentDate;
        this.dictionaryValueId = dictionaryValueId;
        this.getDictionaryValueName = getDictionaryValueName;
        this.sortOrder = sortOrder;
        this.testId = testId;
        this.testName = testName;
    }

    public UUID getId() {
        return id;
    }


    public UUID getDocumentId() {
        return documentId;
    }

    public void setDocumentId(UUID documentId) {
        this.documentId = documentId;
    }

    public String getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(String documentDate) {
        this.documentDate = documentDate;
    }

    public UUID getDictionaryValueId() {
        return dictionaryValueId;
    }

    public void setDictionaryValueId(UUID dictionaryValueId) {
        this.dictionaryValueId = dictionaryValueId;
    }

    public UUID getGetDictionaryValueName() {
        return getDictionaryValueName;
    }

    public void setGetDictionaryValueName(UUID getDictionaryValueName) {
        this.getDictionaryValueName = getDictionaryValueName;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public UUID getTestId() {
        return testId;
    }

    public void setTestId(UUID testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }
}