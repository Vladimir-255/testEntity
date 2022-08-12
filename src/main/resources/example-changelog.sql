-- liquibase formatted sql
CREATE TABLE document (
                          document_id uuid PRIMARY KEY,
                          document_name VARCHAR(50)
);
CREATE TABLE dictonary (
                           dictonary_value_id uuid PRIMARY KEY,
                           dictonary_name VARCHAR(50)
);
CREATE TABLE test (
                      test_id uuid PRIMARY KEY,
                      test_name VARCHAR(50)
);
CREATE TABLE test_entity (
                             id uuid PRIMARY KEY,
                             title VARCHAR(50),
                             document_id uuid,
                             document_date date,
                             dictonary_value_id uuid,
                             sort_order VARCHAR,
                             test_id uuid,
                             FOREIGN KEY (document_id)  REFERENCES document (document_id),
                             FOREIGN KEY (dictonary_value_id)  REFERENCES dictonary (dictonary_value_id),
                             FOREIGN KEY (test_id)  REFERENCES test (test_id)
);
