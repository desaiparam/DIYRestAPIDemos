package org.example.request;

import lombok.Data;

import java.util.List;

@Data
public class StudentRequest {

    private String firstName;
    private String lastName;
    private List<String> classes;
}

