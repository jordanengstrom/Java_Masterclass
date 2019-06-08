package com.company;

public class Wall {
    private double height;
    private double width;

    public Wall() {

    }

    public Wall(double width, double height) {
        if(width >= 0 && height >= 0) {
            this.width = width;
            this.height = height;
        } else if(width < 0 && height < 0) {
            this.width = 0.0;
            this.height = 0.0;
        } else if(height < 0) {
            this.height = 0.0;
            this.width = width;
        } else if(width < 0) {
            this.height = height;
            this.width = 0.0;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        if(width >=0 ) {
            this.width = width;
        } else {
            this.width = 0.0;
        }
    }

    public void setHeight(double height) {
        if(height >= 0) {
            this.height = height;
        } else {
            this.height = 0.0;
        }
    }

    public double getArea() {
        return this.width * this.height;
    }


}
