package com.practice.apidemo.controller;


import com.practice.apidemo.model.Car;
import com.practice.apidemo.model.UserLogin;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class APIController {

    private List<Car> cars = new ArrayList<>();

    @GetMapping(value = "/list/cars")
   public ResponseEntity<List<Car>> listProducts(@RequestParam(value = "color", required = false) String color) {
        cars.add(new Car("Black",  " Audi", 45999.99));
        cars.add(new Car("Red",  " BMW", 55999.00));
        cars.add(new Car("Green", "Mercedes ", 65999.99));
        cars.add(new Car("Blue", "Chevrolet ", 41999.99));
        cars.add(new Car("Green", "BMW ", 55999.99));
        cars.add(new Car("Silver", "Mercedes ", 61199.99));

        ResponseEntity<List<Car>> responseEntity = new ResponseEntity<>(cars, HttpStatus.OK);
        return responseEntity;
    }

    @GetMapping(value = "/list/cars1/{color}")
    public ResponseEntity<List<Car>> listCars1(@PathVariable String color) {
        cars.add(new Car("Black", color + "Audi", 45999.99));
        cars.add(new Car("Red", color + "BMW ", 55999.00));
        cars.add(new Car("Green", color + "Mercedes ", 65999.99));
        cars.add(new Car("Blue", color + "Chevrolet ", 41999.99));
        cars.add(new Car("Green", color + "BMW ", 55999.99));
        cars.add(new Car("Silver", color + "Mercedes ", 61199.99));

        ResponseEntity<List<Car>> responseEntity = new ResponseEntity<>(cars, HttpStatus.OK);
        return responseEntity;
    }
   
        @GetMapping(value = "/list/cars2/{brand}")
        public ResponseEntity<List<Car>> listCars2(@PathVariable String brand) {
            cars.add(new Car("Black", brand + "Audi", 45999.99));
            cars.add(new Car("Red", brand + "BMW ", 55999.00));
            cars.add(new Car("Green", brand + "Mercedes ", 65999.99));
            cars.add(new Car("Blue", brand + "Chevrolet ", 41999.99));
            cars.add(new Car("Green", brand + "BMW ", 55999.99));
            cars.add(new Car("Silver", brand + "Mercedes ", 61199.99));

        

            ResponseEntity<List<Car>> responseEntity = new ResponseEntity<>(cars, HttpStatus.OK);
            return responseEntity;
     
    }
        @PostMapping(value = "/owner/action/login")
        public ResponseEntity<String> userLogin(@RequestBody UserLogin userLoginRequest){
        	return new ResponseEntity<>(userLoginRequest.getUsername() + " is logged in successfully" , HttpStatus.OK);
        }
}
