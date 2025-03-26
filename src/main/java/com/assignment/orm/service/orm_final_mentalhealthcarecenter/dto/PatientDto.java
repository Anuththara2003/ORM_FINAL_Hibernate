package com.assignment.orm.service.orm_final_mentalhealthcarecenter.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PatientDto {
    private String patient_id;
    private String name;
    private String contact;
    private String email;
    private Date date;
    private String medical_history;

}
