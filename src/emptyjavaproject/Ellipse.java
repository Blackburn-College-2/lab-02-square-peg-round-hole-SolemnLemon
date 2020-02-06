/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author sunbe
 */
public class Ellipse extends CircularShape{

    public Measurement getMajorAxis() {
        return majorAxis;
    }

    public Measurement getMinorAxis() {
        return minorAxis;
    }

    public void setMajorAxis(Measurement majorAxis) {
        this.majorAxis = majorAxis;
    }

    public void setMinorAxis(Measurement minorAxis) {
        this.minorAxis = minorAxis;
    }

    public Measurement getPerimeter() {
        return perimeter;
    }

    public Measurement getArea() {
        return area;
    }

    public void setPerimeter(Measurement perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(Measurement area) {
        this.area = area;
    }
    Measurement majorAxis;
    Measurement minorAxis;
    Measurement perimeter;
    Measurement area;

    public Ellipse(Measurement m1, Measurement m2) {
        setMajorAxis(m1);
        setMinorAxis(m2);
        calculateArea();
        calculatePerimeter();

    }

    public Measurement calculatePerimeter() {

        double d = 2.0 * Math.PI;
        double f = Math.pow(getMajorAxis().getValue(), 2.0);
        double g = Math.pow(getMinorAxis().getValue(), 2.0);
        double h = Math.sqrt((f + g) / 2.0);
        
        setPerimeter (new Measurement(d*h,"inches"));
        return getPerimeter();
    }
/**
 * 
 * @return 
 */
    public Measurement calculateArea() {
        setArea(new Measurement(Math.PI * getMajorAxis().getValue()*getMinorAxis().getValue(), "inches"));
        return getArea();
    }
    
       /**
    * This method does calculates the efficiency of the ellipse object
    * @return the efficiency of the shape
    */
    @Override 
    public double getEfficiency() {

        return getArea().getValue()/getPerimeter().getValue();
    }
}


