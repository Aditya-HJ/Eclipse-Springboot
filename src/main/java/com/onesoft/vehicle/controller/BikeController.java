package com.onesoft.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onesoft.vehicle.entity.Bike;
import com.onesoft.vehicle.service.BikeService;

@RestController
@RequestMapping(value="/Bike")
public class BikeController {
	@Autowired
	BikeService bikeser;
	
	@PostMapping(value="/getBike")
	public String saveBike(@RequestBody List<Bike> b) {
		return bikeser.saveBike(b);
	}
	@GetMapping(value="/findId/{e}")
	public Bike findBike(@PathVariable int e) {
		return bikeser.findBike(e); 
	}
	@GetMapping(value="/findAll")
	public List<Bike> findAllBike() {
		return bikeser.findAllBike();
	}
	@PutMapping(value="/update/{a}")
	public String updateBike(@RequestBody Bike a) {
		return bikeser.updateBike(a);
	}
	@GetMapping(value="/getBrands")
	public List<String> getBrand() {
		return bikeser.getBikeBrand();
	}
	@GetMapping(value="/getMax")
	public Bike getMax() {
		return bikeser.getMax();
	}
	@GetMapping(value="/getMin")
	public Bike getMin() {
		return bikeser.getMin();
	}
	@GetMapping(value="/sorted")
	public List<Bike> getSort() {
		return bikeser.getSort();
	}
}
