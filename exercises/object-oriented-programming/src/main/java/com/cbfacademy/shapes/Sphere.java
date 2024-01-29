package com.cbfacademy.shapes;

public class Sphere extends Shape {

    private double radius;

 public Sphere(double radius){
    this.radius = radius;
 }

@Override
public double getArea(){
   return 4 * Math.PI * Math.pow(radius,2);
}
@Override 
public String getName(){
    return "Sphere";
}

    
   
    }

