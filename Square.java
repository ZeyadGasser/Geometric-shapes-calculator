
package com.mycompany.geometric_obj;


    public class Square extends Geometric_obj {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea(double side) {
        if (side >= 0) {
            return side * side;
        } else {
            return -1;
        }
    }

    public double getPerimeter(double side) {
        if (side >= 0) {
            return 4 * side;
        } else {
            return -1;
        }
    }

    @Override
    public double getArea(double length, double width) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getPerimeter(double length, double width) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
