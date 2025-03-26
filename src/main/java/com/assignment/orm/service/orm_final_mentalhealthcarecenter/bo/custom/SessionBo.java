package com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.custom;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.bo.SuperBo;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dto.SessionDto;

import java.sql.SQLException;
import java.util.List;

public interface SessionBo extends SuperBo {
    String getNextId() throws SQLException;
    List<SessionDto> getAll() throws SQLException;
    boolean book(SessionDto sessionDto) throws SQLException;
    boolean cancel(SessionDto sessionDto)throws SQLException;
    boolean reschedule(SessionDto sessionDto) throws SQLException;
    List<SessionDto> getTherapistSchedule(String therapistId);
}
