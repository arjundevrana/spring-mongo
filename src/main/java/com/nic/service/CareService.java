package com.nic.service;

import java.util.List;

import com.nic.entity.Car;

public interface CareService {
	public void create(Car car);
	 
    public void update(Car car);
 
    public void delete(Car car);
 
    public void deleteAll();
 
    public Car find(Car car);
 
    public List < Car > findAll();
}
