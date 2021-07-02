package br.edu.usj.ads.pw.carcollectionapi;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class CarController {
    
    @Autowired
    CarRepository carRepository;

    @GetMapping(value="/")
    public List<Car> getListarTodos() {
        List<Car> lista = carRepository.findAll();
        return lista;
    }
}
