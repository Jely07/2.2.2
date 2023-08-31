package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.ServiceCar;
import web.models.Car;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private final ServiceCar serviceCar;

    public CarsController(ServiceCar serviceCar) {
        this.serviceCar = serviceCar;
    }
    @GetMapping
    public String getCountCars(@RequestParam(value = "count",defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = serviceCar.getCountCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
