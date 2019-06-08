package com.company;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        if(width >= 0 && length >= 0) {
            this.width = width;
            this.length = length;
        } else if(length < 0 && width >= 0) {
            this.length = 0.0;
            this.width = width;
        } else if(width < 0 && length >= 0) {
            this.length = length;
            this.width = 0.0;
        }
    }

    public double getArea(){
        return this.width*this.length;
    }
}
