package web.service;

import org.springframework.stereotype.Service;
import web.dao.DaoCar;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final DaoCar daoCar;

    public CarServiceImpl(DaoCar daoCar) {
        this.daoCar = daoCar;
    }

    @Override
    public List<Car> countCars(int a) {

        return daoCar.countCars(a);
    }
}


