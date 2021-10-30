package com.ilfidev.classes;

public class NoSuchNameException extends Exception{
    private String name;
    public NoSuchNameException(String message, String name){
        super(message);
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
