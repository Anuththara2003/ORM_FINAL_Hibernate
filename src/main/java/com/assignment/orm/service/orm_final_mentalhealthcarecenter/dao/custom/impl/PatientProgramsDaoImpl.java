package com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.custom.impl;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.Cunfig.FactoryConfiguration;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.custom.PatientProgrmasDao;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.PatientProgramsDetails;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.PatinetProgramsDetailsIds;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.sql.SQLException;
import java.util.List;

public class PatientProgramsDaoImpl implements PatientProgrmasDao {
    private final FactoryConfiguration factoryConfiguration = FactoryConfiguration.getInstance();
    @Override
    public String getNextId() throws SQLException {
        return "";
    }

    @Override
    public List<PatientProgramsDetails> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public boolean save(PatientProgramsDetails dto) throws SQLException {
        return false;
    }

    @Override
    public boolean update(PatientProgramsDetails dto) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        return false;
    }

    @Override
    public List<String> getPatientPrograms(String patientId) {
        Session session = factoryConfiguration.getSession();
        try {
            Query<String> query = session.createQuery(
                    "SELECT pp.theraphyProgram.theraphy_pro_id FROM Patient p JOIN p.patientProgramsDetails pp  WHERE p.patient_id = :patientId",
                    String.class
            );
            query.setParameter("patientId", patientId);
            return query.getResultList();
        } finally {
            session.close();
        }
    }

    @Override
    public String getPatientStatus(PatinetProgramsDetailsIds patientId) {
        Session session = factoryConfiguration.getSession();
        PatientProgramsDetails patientProgramsDetails = session.get(PatientProgramsDetails.class,patientId);
        session.close();
        return patientProgramsDetails.getStatus();
    }
}
