package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService serviceCar;

    @Autowired
    public CarController(CarService serviceCar) {
        this.serviceCar = serviceCar;
    }

    @GetMapping("")
    public String getListOfCars(@RequestParam(value = "count", defaultValue = "6", required = false) int count, Model model) {
       model.addAttribute("list", serviceCar.getListOfCar(count, serviceCar.getFullListOfCar()));
        return "cars";
    }
}