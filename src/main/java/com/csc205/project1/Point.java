package com.csc205.project1;


public class Point {

    public double x;
    public double y;
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point p2) {
        return Math.sqrt((p2.x - x) * (p2.x - x) + (p2.y - y) * (p2.y - y));
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void shiftX(double x) {
        this.x = (getX() + x);
    }
    public void shiftY(double y) {
        this.y = (getY() + y);
    }

    public void rotate(double angle) {
        this.x = (getX())*Math.cos(angle) - (getY())*Math.sin(angle);
        this.y = (getX())*Math.sin(angle) + (getY())*Math.cos(angle);
    }


    public String toString() {
        final StringBuilder sb = new StringBuilder("Point{");
        sb.append("x = ")
                .append(x);
        sb.append(", y = ")
                .append(y);
        sb.append('}');
        return sb.toString();
    }

}