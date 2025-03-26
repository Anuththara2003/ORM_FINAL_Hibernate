package com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.custom;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.CrudDao;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.TheraphyProgram;

import java.sql.SQLException;
import java.util.List;

public interface ProgrmasDao extends CrudDao<TheraphyProgram> {
    TheraphyProgram getProgramName(String selectedItem);
    List<String> getAllPrograms() throws SQLException;
    TheraphyProgram getNameFromProgram(String programName) throws SQLException;
    TheraphyProgram getIdFromProgram(String programId) throws SQLException;
}
