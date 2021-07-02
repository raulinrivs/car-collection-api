package br.edu.usj.ads.pw.carcollectionapi;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {
    
    List<Car> findAll();

}