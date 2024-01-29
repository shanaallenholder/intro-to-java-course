package com.cbfacademy.cars;

//Inside the cars package, create a class called Car with the following members
  public class Car {
 

    //constructor that accepts parameters representing the make, model, colour and year of the car
    private String make;
    private String model;
    private String colour;
    private int year;

   public Car(String make, String model, String colour, int year) {
      this.make = make;
      this.model = model;
      this.colour = colour;
      this.year = year;
    }

      // returns the car make
       public String getMake(){
        return make;
      }
      //returns the car model
         public String getModel(){
        return model;
      
       }
       //returns the year the car was made
        public int getYear(){
        return year;

       }

       //returns the colour of the car
        public String getColour(){
        return colour;
       }

        //sets the colour of the car
        public void setColour(String newColour)  {
          this.colour = newColour;
        }

       //returns the car details, including the make, model, colour and year
       public String getCarValues() {
       return String.format("My car is a" + " " + make + " " + model + " "+ colour + " " + year) ;


        }
      
    
        } 
      
