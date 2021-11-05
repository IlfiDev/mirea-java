package com.ilfidev.Classes;

public class VictorianChair implements Chair {
    private int age;
    public VictorianChair(int age){
        this.age = age;
    }
    @Override
    public void sitOnTheChair() {
        System.out.println("На викторианский стул сели.");
    }
    int getAge(){
        return age;
    }
}
