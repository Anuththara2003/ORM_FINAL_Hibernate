package com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.custom;

import javafx.collections.ObservableList;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.SuperBo;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dto.PatientDto;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.PatinetProgramsDetailsIds;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.TheraphyProgram;

import java.sql.SQLException;
import java.util.List;

public interface PatientBo extends SuperBo {
    String getNextId() throws SQLException;
    List<PatientDto> getAll() throws SQLException;
    List<TheraphyProgram> getPatientPrograms(String patientId) throws SQLException;
    String getPatinetStatus(PatinetProgramsDetailsIds patientId);
    boolean patinetSave(PatientDto patientDto, String status, ObservableList<String> programNames) throws SQLException;
    boolean update(PatientDto patientDto, String status, ObservableList<String> programNames) throws SQLException;
    boolean delete(String text)throws SQLException;
    List<PatientDto> getFullEnrolledPatients();
}
