package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO implements DAO {
    @Override
    public List<Car> getListCar(List<Car> list, Integer count) {
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
