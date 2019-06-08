package com.company;

public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double aSquared = Math.pow(this.x, 2.0);
        double bSquared = Math.pow(this.y, 2.0);
        double cSquared = aSquared + bSquared;
        double sqrtOfc  = Math.sqrt(cSquared);
        return sqrtOfc;
    }

    public double distance(int x, int y) {
        double aSquared = Math.pow((double) this.x, 2.0);
        double bSquared = Math.pow((double) this.y, 2.0);
        double cSquared = aSquared + bSquared;
        double sqrtOfc  = Math.sqrt(cSquared);
        return sqrtOfc;
    }

    public double distance(Point otherPoint) {
        // distance formula: sqrt( (x2 - x1)^2 + (y2 - y1)^2 )
        // => a = (x2 - x1)^2
        // => b = (y2 - y1)^2
        // => c = a + b
        // return sqrt(c)
        // be sure to cast x & y

        double a = Math.pow(((double) otherPoint.x - (double) this.x), 2.0);
        double b = Math.pow(((double) otherPoint.y - (double) this.y), 2.0);
        double c = a + b;
        return Math.sqrt(c);

    }

}
