/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bearingpoint.dao.impl;


import com.bearingpoint.dao.intf.GeneralDaoIntf;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Description implements GeneralDaoIntf<Description, Long> {

	private Session currentSession;
	
	private Transaction currentTransaction;

	public Description() {
	}

	public Session openCurrentSession() {
		currentSession = getSessionFactory().openSession();
		return currentSession;
	}

	public Session openCurrentSessionwithTransaction() {
		currentSession = getSessionFactory().openSession();
		currentTransaction = currentSession.beginTransaction();
		return currentSession;
	}
	
	public void closeCurrentSession() {
		currentSession.close();
	}
	
	public void closeCurrentSessionwithTransaction() {
		currentTransaction.commit();
		currentSession.close();
	}
	
	private static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;
	}

	public Session getCurrentSession() {
		return currentSession;
	}

	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}

	public void setCurrentTransaction(Transaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	}

	public void persist(Description entity) {
		getCurrentSession().save(entity);
	}

	public void update(Description entity) {
		getCurrentSession().update(entity);
	}

	public Description findById(Long id) {
		Description Description = (Description) getCurrentSession().get(Description.class, id);
		return Description; 
	}

	public void delete(Description entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<Description> findAll() {
		List<Description> Descriptions = (List<Description>) getCurrentSession().createQuery("from Description").list();
		return Descriptions;
	}

	public void deleteAll() {
		List<Description> entityList = findAll();
		for (Description entity : entityList) {
			delete(entity);
		}
	}



}