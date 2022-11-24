package web.service;

import org.springframework.stereotype.Component;
import web.DAO.CarDaoImpl;
import web.model.Car;

import java.util.List;


    @Component
    public class CarServiseImpl implements CarService {
        CarDaoImpl carDao = new CarDaoImpl();


        @Override
        public List<Car> getFullListOfCar() {
            return carDao.getFullListOfCar();
        }

        @Override
        public List<Car> getListOfCar(int count, List<Car> fullList) {
            System.out.println("сработал метод getListOfCar");
            return (count >= 5) ? fullList : fullList.subList(0, count);

        }
    }
