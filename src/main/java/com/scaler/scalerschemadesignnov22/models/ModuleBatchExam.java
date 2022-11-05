package com.scaler.scalerschemadesignnov22.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@Setter
@Entity
public class ModuleBatchExam extends BaseModel {
    @ManyToOne
    private ModuleBatch moduleBatch;

    @ManyToOne
    private Exam exam;

    private Date startDate;
}
