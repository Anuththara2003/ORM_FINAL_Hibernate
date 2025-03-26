package com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.custom;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.CrudDao;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.Patient;

public interface PatientDao extends CrudDao<Patient> {
    Patient getPatient(String patientId);
}
