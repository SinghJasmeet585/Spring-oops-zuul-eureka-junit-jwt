package org.example;

public class Rectangle extends Shape{
    private Float length;
    private Float breadth;

    public Rectangle(Float length, Float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public Double calculatePerimeter() {
        double ans = 2*(length+breadth);
        return ans;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Float getBreadth() {
        return breadth;
    }

    public void setBreadth(Float breadth) {
        this.breadth = breadth;
    }
}
