package com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.custom.impl;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.Cunfig.FactoryConfiguration;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.custom.TherapistsProgramsDao;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.TheraphyProgram;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.sql.SQLException;
import java.util.List;

public class TherapstsProgramsDaoImpl implements TherapistsProgramsDao {
    private final FactoryConfiguration factoryConfiguration = FactoryConfiguration.getInstance();
    @Override
    public String getNextId() throws SQLException {
        return "";
    }

    @Override
    public List<TheraphyProgram> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public boolean save(TheraphyProgram dto) throws SQLException {
        return false;
    }

    @Override
    public boolean update(TheraphyProgram dto) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        return false;
    }


    @Override
    public List<String> getAssigningPrograms(String therapistId) throws SQLException {
        Session session = factoryConfiguration.getSession();
        try {
            Query<String> query = session.createQuery(
                    "SELECT tp.theraphy_pro_id FROM Theraphist t JOIN t.theraphyPrograms tp WHERE t.theraphists_id = :therapistId",
                    String.class
            );
            query.setParameter("therapistId", therapistId);
            return query.getResultList();
        } finally {
            session.close();
        }
    }

}
