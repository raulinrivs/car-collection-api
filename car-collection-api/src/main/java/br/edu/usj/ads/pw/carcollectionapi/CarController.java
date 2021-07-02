package br.edu.usj.ads.pw.carcollectionapi;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@ResponseBody
@CrossOrigin
public class CarController {
    
    @Autowired
    CarRepository carRepository;

    @GetMapping(value="/")
    public List<Car> getListarTodos() {
        List<Car> lista = carRepository.findAll();
        return lista;
    }

    @GetMapping(value="/details/{id}")
    public Car getCar(@PathVariable Long id) {
        Car car = new Car();
        car = carRepository.findById(id).get();
        return car;
    }

    @PostMapping(value="/add")
    public Car addCar(@RequestBody Car car) {
        Car newCar = carRepository.save(car);
        return newCar;
    }

    @GetMapping(value="/delete/{id}")
    public void getDelete(@PathVariable Long id) {
        carRepository.deleteById(id);
    }
    
}
