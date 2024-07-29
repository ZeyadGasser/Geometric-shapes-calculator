
package com.mycompany.geometric_obj;

class Circle extends Geometric_obj{
    
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(double radius_length) {
        if (radius_length >= 0) {
            return Math.PI*Math.pow(radius_length, 2);
        }

        return -1;

    }

    @Override
    public double getPerimeter(double radius_length) {
        if (radius_length >= 0) {
            return  2*Math.PI*radius_length;
        }

        return -1;
    }

    @Override
    public double getArea(double length, double width) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/Syode/GeneratedMethodBody
    }

    @Override
    public double getPerimeter(double length, double width) {nbfs://nbhost/SystemFileSystem/
        throw new UnsupportedOperationException("Not supported yet."); // Generated from Templates/C
    }

}

    

