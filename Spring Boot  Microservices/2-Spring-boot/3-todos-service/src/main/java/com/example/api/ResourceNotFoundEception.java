package com.example.api;

public class ResourceNotFoundEception extends RuntimeException{
    public ResourceNotFoundEception(String message) {
        super(message);
    }
}
