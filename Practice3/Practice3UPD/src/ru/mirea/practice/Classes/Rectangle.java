package ru.mirea.practice.Classes;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        this.width = 5;
        this.length = 10;
        this.color = "Red";
        this.filled = true;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        this.color = "Red";
        this.filled = true;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public String toString() {
        return "This is Rectangle with sides " + width + " and " + length + ". It's " + color + " and Filled " + filled;
    }
}
