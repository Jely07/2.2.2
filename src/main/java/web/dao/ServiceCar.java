package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceCar {
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(1, "Porsche", "blue"));
        cars.add(new Car(2, "Porsche", "red"));
        cars.add(new Car(3, "Ferrari", "blue"));
        cars.add(new Car(4, "BMW", "black"));
        cars.add(new Car(5, "MERS", "yellow"));
    }
    public List<Car> getCountCars(int count) {
        if (count >=5) {
            count = 5;
        } else if (count<0) {
            count = 0;
        }
        return cars.subList(0,count);
    }

    public List<Car> getCars() {
        return cars;
    }
}
