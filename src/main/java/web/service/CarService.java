package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.dao.DAO;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService implements Service{
    @Autowired
    private DAO dao;
    public static List<Car> cars = new ArrayList<>();
    static {
        cars.add(new Car("BMW", "530d", 2019));
        cars.add(new Car("AUDI", "A8L", 2021));
        cars.add(new Car("BMW", "X5M", 2022));
        cars.add(new Car("TOYOTA", "RAV-4", 2017));
        cars.add(new Car("TOYOTA", "Corolla AE ", 1986));
    }
    @Override
    public List<Car> getListCar(List<Car> list, Integer count) {
        return dao.getListCar(list, count);
    }
}
