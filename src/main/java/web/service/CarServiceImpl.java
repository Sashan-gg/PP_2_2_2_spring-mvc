package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class CarServiceImpl implements CarService {
    static List<Car> carList = new ArrayList<>();
    static {
        carList.add(new Car("model1", 123414, "A012AA"));
        carList.add(new Car("model2", 124154, "S412AS"));
        carList.add(new Car("model3", 654743, "S018ER"));
        carList.add(new Car("model_three_hundred", 300300, "three3hundred00bucks$"));
    }

    @Override
    public List<Car> getCarList(int count) {
        return IntStream.range(0, carList.size())
                .filter(l -> l < count)
                .mapToObj(carList::get)
                .toList();
    }
}
