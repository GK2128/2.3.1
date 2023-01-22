package web.service;

import web.model.Car;

import java.util.List;

public interface Service {
    List<Car> getListCar (List<Car> list, Integer count);
}
