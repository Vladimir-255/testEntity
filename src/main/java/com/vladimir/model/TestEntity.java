package com.vladimir.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "test_entity")
public class TestEntity {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @Column
    @OneToOne
    private Document document;

    @Column(name = "document_date")
    private String documentDate;

    @Column
    @OneToOne
    private Dictionary dictionary;

    @Column(name = "sort_order")
    private String sortOrder;

    @Column
    @OneToOne
    private Test test;

    public TestEntity() {
    }

    public TestEntity(Document document, String documentDate, Dictionary dictionary, String sortOrder, Test test) {
        this.document = document;
        this.documentDate = documentDate;
        this.dictionary = dictionary;
        this.sortOrder = sortOrder;
        this.test = test;
    }

    public UUID getId() {
        return id;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public String getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(String documentDate) {
        this.documentDate = documentDate;
    }

    public Dictionary getDictionary() {
        return dictionary;
    }

    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}