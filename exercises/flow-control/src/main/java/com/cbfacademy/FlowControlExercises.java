package com.cbfacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    //  it creates a list where for each element of the input list ${numbers}
    //  - if the ${element} is divisible by 3, it adds “Fizz” to the list 
    //  - if the ${element} is divisible by 5, it adds “Buzz” to the list 
    //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list 
    //  - it adds the element to the list in any other case 
    //  - it returns the constructed list

    public List<String> fizzBuzz(List<Integer> numbers) {
        List<String> result = new ArrayList<>(); 
             for (int i : numbers) {
                if (i % 3 == 0 && i % 5 == 0 ) {
                result.add("FizzBuzz");
             } else if (i % 5 == 0) {
                result.add("Buzz");
             } else if (i % 3 == 0) {
                result.add("Fizz");
             } else {
                result.add(String.valueOf(i)); 
            }
                 
        }  
               return result;
      }
            
        
    
//  - it returns the month corresponding to the input ${number}
    //  - if the ${number} is invalid, the method should return "Invalid month number"
    public String whichMonth(Integer number) {
       if (number >= 1 && number <= 12) {
        switch (number) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid month number";
       }    
           }else{
            return "Invalid month number";
           }                
                
            }  
    


        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            numbers.add(i);
        }  
           int sumOfEvens = 0;
           int sumOfOdds = 0;

           for (int i : numbers) {
            if (i % 2 == 0) {
                sumOfEvens += i;
            } else {
                sumOfOdds +=i;
            }
            
           }
            return Map.of("SumOfEvens", sumOfEvens, "SumOfOdds", sumOfOdds);
        }


        //  - it takes an array list of integers
        //  - it returns the list in reverse order
    public List<Integer> reverse(ArrayList<Integer> numbers) {
           Collections.reverse(numbers);
           return (numbers);
    }
        

            
    

    public String getName() {
        return "Flow Control Exercises";
    }
}
