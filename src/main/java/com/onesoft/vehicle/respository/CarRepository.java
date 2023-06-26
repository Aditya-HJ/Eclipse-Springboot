package com.onesoft.vehicle.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onesoft.vehicle.entity.Car;

public interface CarRepository extends JpaRepository<Car,Integer>{

}
