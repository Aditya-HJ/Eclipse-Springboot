package com.onesoft.vehicle.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesoft.vehicle.dao.CarDao;
import com.onesoft.vehicle.entity.Car;

@Service
public class CarService {
	@Autowired
	CarDao cardao;
	public String addCars(List<Car> c) {
		return cardao.addCars(c);
	}
	public String updateCars(Car c) {
		return cardao.updateCars(c);
	}
	public List<Car> readCars() {
		return cardao.readCars();
	}
	public Car getMax() {
		List<Car> max=cardao.readCars();
		return max.stream().max(Comparator.comparing(Car::getPrice)).get();
	}
	public Car getMin() {
		List<Car> min=cardao.readCars();
		return min.stream().min(Comparator.comparing(Car::getPrice)).get();
	}
	public List<Car> getAllBrand(String brand) {
		List<Car> brand1=cardao.readCars();
		return brand1.stream().filter(x->x.getBrand().equalsIgnoreCase(brand)).collect(Collectors.toList());
	}
	public List<Car> getAllPrice(int a) {
		List<Car> price=cardao.readCars();
		return price.stream().filter(x->x.getPrice()>=a).collect(Collectors.toList());
	}
}
