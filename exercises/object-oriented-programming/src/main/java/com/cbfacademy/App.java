package com.cbfacademy;

import java.util.List;

import com.cbfacademy.cars.Car;
import com.cbfacademy.cars.Showroom;

public class App {
       public static void main(String[] args) {

         Showroom showroom = new Showroom(); 
         List<Car> cars = showroom.getCars();

        for (Car car : cars){
        System.out.println(car.getCarValues());
    }
    
        } 


    }

