package com.onesoft.vehicle.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesoft.vehicle.dao.BikeDao;
import com.onesoft.vehicle.entity.Bike;
import com.onesoft.vehicle.entity.Car;

@Service
public class BikeService {
	@Autowired
	BikeDao bikedao;
	public String saveBike(List<Bike> c) {
		return bikedao.saveBike(c);
	}
	public Bike findBike(int e) {
		return bikedao.findBike(e);
	}
	public List<Bike> findAllBike() {
		return bikedao.findAllBike();
	}
	public String updateBike(Bike a) {
		return bikedao.updateBike(a);
	}
	public List<String> getBikeBrand() {
		List<Bike> bike=bikedao.findAllBike();
		return bike.stream().map(x->x.getBrand()).collect(Collectors.toList());
	}
	public Bike getMax() {
		List<Bike> max=bikedao.findAllBike();
		return max.stream().max(Comparator.comparing(Bike::getPrice)).get();
	}
	public Bike getMin() {
		List<Bike> min=bikedao.findAllBike();
		return min.stream().min(Comparator.comparing(Bike::getPrice)).get();
	}
	public List<Bike> getSort() {
		List<Bike> bikeSort=bikedao.findAllBike();
		return bikeSort.stream().sorted(Comparator.comparing(Bike::getModel)).collect(Collectors.toList());
	}
}
