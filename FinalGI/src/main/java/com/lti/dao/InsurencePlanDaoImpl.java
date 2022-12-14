package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.InsurancePlan;

@Repository
public class InsurencePlanDaoImpl implements InsurancePlanDao {
	@PersistenceContext
    private EntityManager em;
   @Override
   
   @Transactional
   public int addInsurance(InsurancePlan i) {
       em.persist(i);
       return i.getInsid();
   }

	@Override
    public List<InsurancePlan> getAllInsurancePlan() {
        Query qry = em.createQuery("select plan from InsurancePlan as plan");
        List<InsurancePlan> list = qry.getResultList();
        return list;
        
    }

	 @Override
	    public InsurancePlan findById(int id) {
	        InsurancePlan i1 = em.find(InsurancePlan.class, id);
	        return i1;
	        
	    }

}
