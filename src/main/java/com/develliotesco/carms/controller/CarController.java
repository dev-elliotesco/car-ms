package com.develliotesco.carms.controller;

import com.develliotesco.carms.entity.Car;
import com.develliotesco.carms.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
@AllArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping
    public ResponseEntity<List<Car>> getAll() {
        List<Car> cars = carService.getAll();
        return ResponseEntity.ok(cars);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> getById(@PathVariable int id) {
        Car car = carService.getById(id);
        return ResponseEntity.ok(car);
    }

    @PostMapping
    public ResponseEntity<Car> save(@RequestBody Car car) {
        Car savedCar = carService.save(car);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCar);
    }

    @GetMapping("/byuser/{userId}")
    public ResponseEntity<List<Car>> getByUserId(@PathVariable int userId) {
        List<Car> cars = carService.getByUserId(userId);
        return ResponseEntity.ok(cars);
    }
}
