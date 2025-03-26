package com.assignment.orm.service.orm_final_mentalhealthcarecenter.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SessionDto {
    private String session_id;
    private Date date;
    private Time time;
    private String status;
    private String patient_id;
    private String therapist_id;
    private String program_id;
}
