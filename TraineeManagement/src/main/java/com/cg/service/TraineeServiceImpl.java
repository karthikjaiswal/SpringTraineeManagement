package com.cg.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.TraineeDao;
import com.cg.model.TraineeDetails;

@Transactional
@Service
@Component("traineeService")
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	TraineeDao traineeDao;
	
	
	@Override
	public TraineeDetails addTrainee(TraineeDetails traineeDetails) {
		
		return traineeDao.addTrainee(traineeDetails);
	}

	@Override
	public TraineeDetails deleteTrainee(int id) {
	
		return traineeDao.deleteTrainee(id);
	}

	@Override
	public TraineeDetails updateTrainee(TraineeDetails traineeDetails) {
		
		return traineeDao.updateTrainee(traineeDetails);
	}

	@Override
	public TraineeDetails retrieveById(int id) {
		
		return traineeDao.retrieveById(id);
	}

	@Override
	public ArrayList<TraineeDetails> retrieveAll() {
		
		return traineeDao.retrieveAll();
	}

}
