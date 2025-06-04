package com.examly.exception;

public class EmailAlreadyRegisteredException extends Exception{
    public EmailAlreadyRegisteredException(String message){
        super(message);
    }
}
