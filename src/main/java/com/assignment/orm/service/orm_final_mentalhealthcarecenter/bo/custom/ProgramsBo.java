package com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.custom;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.SuperBo;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dto.ProgramDto;

import java.sql.SQLException;
import java.util.List;

public interface ProgramsBo extends SuperBo {
     List<String> getAllPrograms() throws SQLException;
     String getNextId() throws SQLException;
     List<ProgramDto> getAll() throws SQLException;
     boolean save(ProgramDto programDto) throws SQLException;
     boolean update(ProgramDto programDto) throws SQLException;
     boolean delete(String id) throws SQLException;
     String getProgramName(String selectedItem);
}
