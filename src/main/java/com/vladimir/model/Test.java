package com.vladimir.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "test")
public class Test {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "BINARY(16)", name = "test_id")
    private UUID testId;

    @Column(name = "test_name")
    private String testName;

}
