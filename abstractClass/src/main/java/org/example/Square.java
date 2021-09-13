package org.example;

public class Square extends Shape{
    private Float side;

    public Square(Float side) {
        this.side = side;
    }

    @Override
    public Double calculatePerimeter() {
        double ans = 4*side;
        return ans;
    }

    public Float getSide() {
        return side;
    }

    public void setSide(Float side) {
        this.side = side;
    }
}
