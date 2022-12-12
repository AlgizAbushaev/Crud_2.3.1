package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DaoCarImpl implements DaoCar {

    private static int CARS_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++CARS_COUNT, "Toyota", "Camry"));
        cars.add(new Car(++CARS_COUNT, "Lada", "Kalina"));
        cars.add(new Car(++CARS_COUNT, "Uaz", "Patriot"));
        cars.add(new Car(++CARS_COUNT, "Opel", "Astra"));
        cars.add(new Car(++CARS_COUNT, "KIA", "Spectra"));
    }

    @Override
    public List<Car> countCars(int a) {
        List<Car> carCopy = new ArrayList<>();
        if (a == 0 || a > 5) {
            return cars;
        } else {
            if (a < 5) {
                for (int i = 0; i <= a - 1; i++) {
                    carCopy.add(cars.get(i));
                }
            }
            return carCopy;
        }
    }
}
