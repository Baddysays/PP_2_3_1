package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDaoImpl implements CarDao {
    public final List<Car> resultList;

    {
        resultList = new ArrayList<>();

        resultList.add(new Car("Lada", 10, "green"));
        resultList.add(new Car("Chery", 36, "black"));
        resultList.add(new Car("Mazda", 01, "blue"));
        resultList.add(new Car("Audi", 4, "grey"));
        resultList.add(new Car("Wolf-ien", 200, "blue"));
    }
    @Override
    public List<Car> getFullListOfCar() {
        System.out.println("сработал метод getFullListOfCar");

        return resultList;
    }
}
