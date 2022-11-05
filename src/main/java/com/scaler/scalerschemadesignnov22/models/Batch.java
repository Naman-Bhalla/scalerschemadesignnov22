package com.scaler.scalerschemadesignnov22.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Getter
@Setter
@Entity
public class Batch extends BaseModel {
    private String name;

    @ManyToOne
    private Student batchRepresentative;

    @ManyToMany
    private List<Student> students;
}

//  1: 1
//  m: 1
// B : S
// 1. student is a part of that batch m:m
// 2. student is a representative of batch m:1
