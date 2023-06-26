package com.onesoft.vehicle.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesoft.vehicle.entity.Car;
import com.onesoft.vehicle.respository.CarRepository;

@Repository
public class CarDao {
	@Autowired
	CarRepository carres;
	public String addCars(List<Car> c) {
		carres.saveAll(c);
		return "Successfully saved";
	}
	public String updateCars(Car c) {
		carres.save(c);
		return "Successfully updated";
	}
	public List<Car> readCars() {
		return carres.findAll();
	}
}
