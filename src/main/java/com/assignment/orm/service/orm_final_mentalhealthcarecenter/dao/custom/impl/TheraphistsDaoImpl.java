package com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.custom.impl;

import com.assignment.orm.service.orm_final_mentalhealthcarecenter.Cunfig.FactoryConfiguration;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.dao.custom.TheraphistsDao;
import com.assignment.orm.service.orm_final_mentalhealthcarecenter.entity.Theraphist;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TheraphistsDaoImpl implements TheraphistsDao {
    private final FactoryConfiguration factoryConfiguration = FactoryConfiguration.getInstance();
    @Override
    public String getNextId() throws SQLException {
        Session session = factoryConfiguration.getSession();
        String lastId = session.createQuery("select t.theraphists_id from Theraphist t order by t.theraphists_id desc", String.class).setMaxResults(1).uniqueResult();
        return lastId;
    }

    @Override
    public List<Theraphist> getAll() throws SQLException {
        Session session = factoryConfiguration.getSession();
        List<Theraphist> fromTheraphist = session.createQuery("from Theraphist", Theraphist.class).list();
        ArrayList<Theraphist> theraphistArrayList = new ArrayList<>();
        theraphistArrayList.addAll(fromTheraphist);

        return theraphistArrayList;
    }

    @Override
    public boolean save(Theraphist theraphist) throws SQLException {
        Session session = factoryConfiguration.getSession();
        Transaction transaction = session.beginTransaction();

        try {
            session.persist(theraphist);
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
    public boolean update(Theraphist theraphist) throws SQLException {
        Session session = factoryConfiguration.getSession();
        Transaction transaction = session.beginTransaction();

        try {
            session.merge(theraphist);
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
            Theraphist theraphist = session.get(Theraphist.class, id);
            if (theraphist != null){
                session.remove(theraphist);
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
    public Theraphist getTherapist(String therapistId) {
        Session session = factoryConfiguration.getSession();
        Theraphist theraphist = session.get(Theraphist.class, therapistId);
        session.close();
        return theraphist;
    }
}
