package com.cbfacademy.cars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Showroom {
  
public List<Car> getCars() {
   List<Car> car = new ArrayList<>();



Car volvo = new Car("Volvo", "V40", "blue", 2012);
Car porsche = new Car("Porsche", "Panamera", "red", 2009);
Car audi = new Car("Audi", "A3", "grey", 2018);

 
car.add(volvo);
car.add(porsche);
car.add(audi);
    
   return car;
}

}