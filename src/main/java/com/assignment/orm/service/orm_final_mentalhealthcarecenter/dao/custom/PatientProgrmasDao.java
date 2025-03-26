package com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.custom;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.CrudDao;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.PatientProgramsDetails;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.PatinetProgramsDetailsIds;

import java.util.List;

public interface PatientProgrmasDao extends CrudDao<PatientProgramsDetails> {
    List<String> getPatientPrograms(String patientId);
    String getPatientStatus(PatinetProgramsDetailsIds patientId);
}
