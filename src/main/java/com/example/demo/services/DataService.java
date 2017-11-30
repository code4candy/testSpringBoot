package com.example.demo.services;

import com.example.demo.models.Car;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class DataService {

    private Map<Integer, Car> carMap ;


    @PostConstruct
    public void loadCarsFromJson() throws IOException {
            ObjectMapper objectMapper = new ObjectMapper();
            InputStream input = this.getClass().getClassLoader().getResourceAsStream("car_list.json");
            List<Car> cars = objectMapper.readValue(input, new TypeReference<List<Car>>() {
            });

            // create map with id as key and song as value
            carMap = cars.stream().collect(Collectors.toMap(Car::getId, Function.identity()));
    }

    public Map<Integer, Car> getCarMap() {
        return carMap;
    }
}
