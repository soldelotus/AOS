package com.example.aos.azure.demo.Exception;

public class FilmNotFoundException extends Exception{
    
    public FilmNotFoundException(String message){
        super(message);
    }
}
