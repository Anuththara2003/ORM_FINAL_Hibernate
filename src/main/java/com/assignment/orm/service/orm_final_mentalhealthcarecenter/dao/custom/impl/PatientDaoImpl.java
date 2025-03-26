package com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.custom.impl;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.Cunfig.FactoryConfiguration;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.custom.PatientDao;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.Patient;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PatientDaoImpl implements PatientDao {
    private final FactoryConfiguration factoryConfiguration = FactoryConfiguration.getInstance();
    @Override
    public String getNextId() throws SQLException {
        Session session = factoryConfiguration.getSession();
        String lastId = session.createQuery("select p.patient_id from Patient p order by p.patient_id desc", String.class).setMaxResults(1).uniqueResult();
        return lastId;
    }

    @Override
    public List<Patient> getAll() throws SQLException {
        Session session = factoryConfiguration.getSession();
        List<Patient> patients = session.createQuery("from Patient", Patient.class).list();
        ArrayList<Patient> patientArrayList = new ArrayList<>();
        patientArrayList.addAll(patients);

        return patientArrayList;
    }

    @Override
    public boolean save(Patient patient) throws SQLException {
        Session session = factoryConfiguration.getSession();
        Transaction transaction = session.beginTransaction();

        try {
            session.merge(patient);
            transaction.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally {
            if (session != null){
                session.close();
            }
        }
    }

    @Override
    public boolean update(Patient patient) throws SQLException {
        Session session = factoryConfiguration.getSession();
        Transaction transaction = session.beginTransaction();

        try {
            session.merge(patient);
            transaction.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally {
            if (session != null){
                session.close();
            }
        }
    }

    @Override
    public boolean delete(String id) throws SQLException {
        Session session = factoryConfiguration.getSession();
        Transaction transaction = session.beginTransaction();

        try{
            Patient patient = session.get(Patient.class, id);
            if (patient != null){
                session.remove(patient);
                transaction.commit();
                return true;
            }else{
                System.out.println("User is null");
                return false;
            }


        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally {
            if (session != null){
                session.close();
            }

        }
    }

    @Override
    public Patient getPatient(String patientId) {
        Session session = factoryConfiguration.getSession();
        Patient patient = session.get(Patient.class, patientId);
        session.close();
        return patient;
    }
}
