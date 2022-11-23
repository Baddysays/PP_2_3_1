package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


    @Component
    public class CarServiseImpl implements CarService {

        private final List<Car> resultList;

        {
            resultList = new ArrayList<>();

            resultList.add(new Car("BMW", 123, "black"));
            resultList.add(new Car("Chery", 7, "white"));
            resultList.add(new Car("Chevrolet", 23, "yellow"));
            resultList.add(new Car("Audi", 15, "grey"));
            resultList.add(new Car("Jeep", 24, "blue"));
        }

        @Override
        public List<Car> getFullListOfCar() {
            System.out.println("сработал метод getFullListOfCar");

            return resultList;
        }

        @Override
        public List<Car> getListOfCar(int count, List<Car> fullList) {
            System.out.println("сработал метод getListOfCar");
            return (count >= 5) ? fullList : fullList.subList(0, count);

        }
    }
