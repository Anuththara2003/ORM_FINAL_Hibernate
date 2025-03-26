package com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.custom;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.SuperBo;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dto.TherapistDto;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.TheraphyProgram;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;

public interface TheraphistsBo extends SuperBo {
     String getNextId() throws SQLException;
     List<TherapistDto> getAll() throws SQLException;
     boolean saveTherapist(TherapistDto therapistDto ,List<String> programNames) throws SQLException;
     boolean delete(String id) throws SQLException;
     boolean update(TherapistDto therapistDto ,List<String> programNames) throws SQLException;
     List<TheraphyProgram> getAssigningPrograms(String therapistId) throws SQLException;
     List<TherapistDto> getAvailableTherapist(String programId, Time time, Date date);
}
