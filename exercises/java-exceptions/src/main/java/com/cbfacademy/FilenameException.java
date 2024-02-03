package com.cbfacademy;

//created a custom (checked) exception class called FilenameException
public class FilenameException extends Exception {

    //any custom checked exception class extends exception class 
    FilenameException(String message){
        super(message);
    }

    
}
