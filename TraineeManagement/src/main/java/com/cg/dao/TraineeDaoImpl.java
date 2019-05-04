package com.cg.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import com.cg.model.TraineeDetails;

@Repository
@Component("traineeDao")
@ComponentScan("com")
public class TraineeDaoImpl implements TraineeDao{

	@PersistenceContext
	EntityManager entityManager;

	

	@Override
	public TraineeDetails addTrainee(TraineeDetails traineeDetails) {
		entityManager.persist(traineeDetails);
		return traineeDetails;
	}

	@Override
	public TraineeDetails deleteTrainee(int id) {
		
		TraineeDetails traineeDetails =new TraineeDetails();
		traineeDetails.setTraineeId(id);
		entityManager.remove(retrieveById(id));
		return null;
	}

	@Override
	public TraineeDetails updateTrainee(TraineeDetails traineeDetails) {
		entityManager.merge(traineeDetails);
		return null;
	}

	@Override
	public TraineeDetails retrieveById(int id) {
		TraineeDetails traineeDetails=entityManager.find(TraineeDetails.class, id);
		return traineeDetails;
	}

	@Override
	public ArrayList<TraineeDetails> retrieveAll() {
		@SuppressWarnings("unchecked")
		Query<TraineeDetails> query = (Query<TraineeDetails>) entityManager.createQuery("from TraineeDetails ");
		ArrayList<TraineeDetails> traineeList = (ArrayList<TraineeDetails>) query.list();
		return traineeList;
	}

}
