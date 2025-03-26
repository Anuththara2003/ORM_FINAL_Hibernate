package com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.custom;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.CrudDao;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.TheraphyProgram;

import java.sql.SQLException;
import java.util.List;

public interface TherapistsProgramsDao extends CrudDao<TheraphyProgram> {
    List<String> getAssigningPrograms(String id) throws SQLException;
}
