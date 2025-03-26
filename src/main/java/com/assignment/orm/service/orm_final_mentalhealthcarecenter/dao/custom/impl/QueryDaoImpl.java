package com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.custom.impl;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.Cunfig.FactoryConfiguration;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.custom.QueryDao;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.Patient;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.Theraphist;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.TheraphySession;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;


public class QueryDaoImpl implements QueryDao {
    private final FactoryConfiguration factoryConfiguration = FactoryConfiguration.getInstance();

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
    public List<Theraphist> getAvailableTherapist(String programId, Time time, Date date) {
        Session session = factoryConfiguration.getSession();

        try {
            Query<Theraphist> query = session.createQuery("SELECT t FROM Theraphist t JOIN t.theraphyPrograms tp WHERE tp.theraphy_pro_id = :programId", Theraphist.class);
            query.setParameter("programId", programId);
            List<Theraphist> therapists = query.getResultList();

            List<Theraphist> availableTheraphistList = new ArrayList<>();
            for (Theraphist theraphist : therapists) {
                Query<TheraphySession> query1 = session.createQuery("FROM TheraphySession ts WHERE ts.theraphist = :therapist AND ts.date = :date AND ts.time = :time", TheraphySession.class);
                query1.setParameter("therapist", theraphist);
                query1.setParameter("date", date);
                query1.setParameter("time", time);
                List<TheraphySession> sessions = query1.getResultList();

                if (sessions.isEmpty()) {
                    availableTheraphistList.add(theraphist);
                }
            }
            return availableTheraphistList;
        } finally {
            if (session != null) {
                session.close();
            }

        }

    }

    @Override
    public List<Patient> getFullEnrolledPatients() {
        return List.of();
    }



}
