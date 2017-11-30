package com.example.demo;

import com.example.demo.models.Car;
import com.example.demo.services.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CarController {

    private DataService dataService;

    @Autowired
    public CarController(DataService dataService) {
        this.dataService = dataService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/cars")
    public Map<Integer, Car> getCars(){
        return dataService.getCarMap();
    }

}
