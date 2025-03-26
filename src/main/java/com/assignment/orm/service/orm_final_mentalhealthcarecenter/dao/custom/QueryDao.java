package com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.custom;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.SuperDao;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.Patient;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.Theraphist;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

public interface QueryDao extends SuperDao {
    List<String> getPatientPrograms(String patientId);
    List<Patient> getFullEnrolledPatients();
    List<Theraphist> getAvailableTherapist(String programId, Time time, Date date);
}
