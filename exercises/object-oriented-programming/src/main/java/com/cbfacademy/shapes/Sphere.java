package com.cbfacademy.shapes;

public class Sphere extends Shape {

    private double radius;

 public Sphere(double radius){
    this.radius = radius;
 }

@Override
public double getArea(){
   return (4 * Math.PI *(radius * radius));
}
@Override 
public String getName(){
    return "Sphere";
}

    
   
    }

