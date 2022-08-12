package com.vladimir.model;


import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "document")
public class Document {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "BINARY(16)", name = "document_id")
    private UUID documentId;

    @Column(name = "document_name")
    private String documentName;
}
