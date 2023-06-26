package com.onesoft.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.onesoft.vehicle.entity.Car;
import com.onesoft.vehicle.entity.Employee;
import com.onesoft.vehicle.service.CarService;

@RestController
@RequestMapping(value = "/car")
public class CarController {
	@Autowired
	CarService carser;
	
	@PostMapping(value="/saveCars")
	public String addCars(@RequestBody List<Car> c) {
		return carser.addCars(c);
	}
	@PutMapping(value="/update/{c}")	
	public String updateCars(@RequestBody Car c) {
		return carser.updateCars(c);
	}
	@GetMapping(value="/readAll")
	public List<Car> readCars() {
		return carser.readCars();
	}
	@GetMapping(value="/getMax")
	public Car getMax() {
		return carser.getMax();
	}
	@GetMapping(value="/getMin")
	public Car getMin() {
		return carser.getMin();
	}
	@GetMapping(value="/getbrand/{brand}")
	public List<Car> getAllBrand(@PathVariable String brand) {
		return carser.getAllBrand(brand);
	}
	@GetMapping(value="/getprice/{a}")
	public List<Car> getAllprice(@PathVariable int a) {
		return carser.getAllPrice(a);
	}
	RestTemplate rt=new RestTemplate();
	@GetMapping(value="/getemployeeviacar")
	public List<String> getName() {
		String url="http://localhost:8081/findByName";
		ResponseEntity<List<String>> response=rt.exchange(url,HttpMethod.GET,null,new ParameterizedTypeReference<List<String>>(){});
		List<String> empName=response.getBody();
		return empName;
	}
	@GetMapping(value="/getempviacar/{name}")
	public List<Employee> getByName(@PathVariable String name) {
		String url="http://localhost:8081/findName/";
		ResponseEntity<List<Employee>> res=rt.exchange(url+name,HttpMethod.GET,null,new ParameterizedTypeReference<List<Employee>>(){});
		List<Employee> empdetails=res.getBody();
		return empdetails;
	}
	@GetMapping(value="/getempmax")
	public Employee getMax1() {
		String url="http://localhost:8081/getMax";
		ResponseEntity<Employee> res=rt.exchange(url,HttpMethod.GET,null,new ParameterizedTypeReference<Employee>(){});
		Employee max=res.getBody();
		return max;
	}
	@GetMapping(value="/getAllemp")
	public List<Employee> getAllEmp() {
		String url="http://localhost:8081/Read";
		ResponseEntity<List<Employee>> res=rt.exchange(url,HttpMethod.GET,null,new ParameterizedTypeReference<List<Employee>>(){});
		List<Employee> allEmp=res.getBody();
		return allEmp;
	}
}
