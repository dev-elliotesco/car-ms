package com.develliotesco.carms.service;

import com.develliotesco.carms.entity.Car;
import com.develliotesco.carms.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public List<Car> getAll() {
        return carRepository.findAll();
    }

    public Car getById(int id) {
        return carRepository.findById(id).orElse(null);
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public List<Car> getByUserId(int userId) {
        return carRepository.findByUserId(userId);
    }
}
