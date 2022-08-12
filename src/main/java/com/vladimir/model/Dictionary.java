package com.vladimir.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "dictonary")
public class Dictionary {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "BINARY(16)", name="dictonary_value_id")
    private UUID dictonaryValueId;

    @Column(name = "dictonary_value_name")
    private String dictionaryValueName;

}
