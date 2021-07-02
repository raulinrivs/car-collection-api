package br.edu.usj.ads.pw.carcollectionapi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Car{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String brand;
    String model;
    Integer horsePower;
    String color;
}