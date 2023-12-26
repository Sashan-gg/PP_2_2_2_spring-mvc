package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    static List<Car> carList = new ArrayList<>();
    static {
        carList.add(new Car("model1", 123414, "A012AA"));
        carList.add(new Car("model2", 124154, "S412AS"));
        carList.add(new Car("model3", 654743, "S018ER"));
        carList.add(new Car("model_three_hundred", 300300, "three3hundred00bucks$"));
    }

    @GetMapping("/cars")
    public String carPageWithParam(ModelMap model, HttpServletRequest request) {
        String param = request.getParameter("count");
        if (param != null) {
            int count = Integer.parseInt(param);
            if (count < 0) {
                count = 0;
            } else if (count > carList.size()) {
                count = carList.size();
            }
            model.addAttribute("cars", carList.subList(0, count));
        } else {
            model.addAttribute("cars", carList);
        }
        return "car";
    }
}