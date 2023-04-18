package com.example.api_estacionamiento_vehiculos.services;

import com.example.api_estacionamiento_vehiculos.models.Car;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParkingService {
    ArrayList<Car> cars = new ArrayList<>();

    public List<Car> getAllCars(){
        return cars;
    }

    public Car addCar(Car car){
        car.setEntryTime(LocalDateTime.now());
        cars.add(car);
        return car;
    }
}
