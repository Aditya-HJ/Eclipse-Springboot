package com.onesoft.vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesoft.vehicle.entity.Bike;
import com.onesoft.vehicle.respository.BikeRepository;

@Repository
public class BikeDao {
	@Autowired
	BikeRepository bikerep;
	public String saveBike(List<Bike> b) {
		bikerep.saveAll(b);
		return "Saved Succesfully";
	}
	public Bike findBike(int e) {
		return bikerep.findById(e).get();
	}
	public List<Bike> findAllBike() {
		return bikerep.findAll();
	}
	public String updateBike(Bike a) {
		bikerep.save(a);
		return "Updated Successfully";
	}
}
