package com.onesoft.vehicle.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onesoft.vehicle.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike,Integer> {

}
