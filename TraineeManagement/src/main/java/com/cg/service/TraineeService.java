package com.cg.service;

import java.util.ArrayList;

import com.cg.model.TraineeDetails;

public interface TraineeService {
	
	 TraineeDetails addTrainee(TraineeDetails traineeDetails);
	 TraineeDetails deleteTrainee(int id);
	 TraineeDetails updateTrainee(TraineeDetails traineeDetails);
	 TraineeDetails retrieveById(int id);
	 ArrayList<TraineeDetails> retrieveAll();
}
