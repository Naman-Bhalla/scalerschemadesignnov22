package com.scaler.scalerschemadesignnov22.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class Student extends BaseModel {
    private String name;
    private String email;
    private String password;

    @ManyToMany(mappedBy = "students")
    private List<Batch> batches;

    @OneToMany(mappedBy = "batchRepresentative")
    private List<Batch> classRepresentativeOf;
}
