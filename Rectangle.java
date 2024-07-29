
package com.mycompany.geometric_obj;

public class Rectangle extends Geometric_obj {

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea(double width, double height) {

        if (width >= 0 && height >= 0) {
            return width * height;
        } else {
            return -1;
        }
    }

    @Override
    public double getPerimeter(double width, double height) {
        if (width >= 0 && height >= 0) {
            return 2 * (width + height);
        } else {
            return -1;
        }
    }

    @Override
    public double getArea(double radius) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getPerimeter(double radius) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
