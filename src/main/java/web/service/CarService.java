package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {

    private List<Car> cars;
    {
        cars = new ArrayList<>();

        cars.add(new Car("Jaguar", "Gren", 1980));
        cars.add(new Car("Ferrari", "Red", 1975));
        cars.add(new Car("Bugatti", "Blue", 2020));
        cars.add(new Car("Maseratti", "Orange", 2010));
        cars.add(new Car("Porshe", "Brown", 2007));


    }


    public List<Car> countCars(Integer count) {
        if ((count == null) || (count > 5) || (count < 0)) {
            count = 5;
        }
//        return cars.subList(0, count);
        return cars.stream().limit(count).collect(Collectors.toList());
    }


}
