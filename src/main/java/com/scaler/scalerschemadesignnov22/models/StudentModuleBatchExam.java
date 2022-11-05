package com.scaler.scalerschemadesignnov22.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity // Spring Data JPA
// Entity annotation on a class tells spring boot that you want
// to create a table for this model
public class StudentModuleBatchExam extends BaseModel {
    @ManyToOne
    private ModuleBatchExam moduleBatchExam;
    @ManyToOne
    private Student student;
    private int marks;
    private boolean attempted;
    private String result;
}
