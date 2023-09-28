package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Toyota",2015, 5));
        cars.add(new Car("Honda", 2010, 3));
        cars.add(new Car("Mazda", 2018, 3));
        cars.add(new Car("Nissan", 2012, 5));
        cars.add(new Car("Mitsubishi", 2019, 5));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size() || count <= 0) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
