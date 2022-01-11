package com.codegym;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getArea(){
        double s = (this.side1+this.side2+this.side3)/2;
        return Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));
    }
    public double getPerimeter(){
        return Double.sum(this.side1, Double.sum(this.side2,this.side3));
    }

    @Override
    public String toString() {
        return "A Triangle with side: " + side1 +", "+ side2 +", "+ side3 + ", Area = "+getArea()+", Perimeter= "+ getPerimeter();
    }
}
