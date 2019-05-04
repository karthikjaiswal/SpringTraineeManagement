package com.cg.control;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.TraineeDetails;
import com.cg.service.TraineeService;

@RestController
public class TraineeController {

	@Autowired
	TraineeService traineeService;
	
	@GetMapping(value="/")
	public String start() {
		return "Hello";
	}
	@PostMapping(value="/add")
	public ResponseEntity<?> register(@RequestBody TraineeDetails traineeDetails) {
		traineeService.addTrainee(traineeDetails);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@PutMapping("/modify")
	public ResponseEntity<?> updateData(@RequestBody TraineeDetails traineeDetails) {
		traineeService.updateTrainee(traineeDetails);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteTrainee(@RequestBody int id) {
		traineeService.deleteTrainee(id);
		return new ResponseEntity<>(HttpStatus.OK);		
	}
	
	@GetMapping("/getById")
	public TraineeDetails getByPid(@RequestBody int id) {
		TraineeDetails trainee=traineeService.retrieveById(id);
		return trainee;
	}

	@GetMapping("/getAll")
	public ArrayList<TraineeDetails> getAllProducts(){
		ArrayList<TraineeDetails> trainees = traineeService.retrieveAll();
		return trainees;
	}
}
