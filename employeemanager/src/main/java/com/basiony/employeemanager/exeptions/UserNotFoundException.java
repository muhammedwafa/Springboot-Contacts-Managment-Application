package com.basiony.employeemanager.exeptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message); //this should call the constructor and pass the message.
    }
}
