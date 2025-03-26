package com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.custom;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.CrudDao;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.TheraphySession;

import java.util.List;

public interface SessionDao extends CrudDao<TheraphySession> {
    boolean cancel(TheraphySession theraphySession);
    boolean reschedule(TheraphySession theraphySession);
    List<TheraphySession> getTherapistSchedule(String therapistId);
}
