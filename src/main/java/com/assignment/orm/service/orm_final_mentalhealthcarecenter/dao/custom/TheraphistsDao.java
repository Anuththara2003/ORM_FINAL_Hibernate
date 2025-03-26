package com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.custom;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.CrudDao;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.Theraphist;

public interface TheraphistsDao extends CrudDao<Theraphist> {
    Theraphist getTherapist(String therapistId);
}
