/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *defines a circle
 * @author sunbe
 */
public class Circle extends CircularShape {

    private Measurement perimeter;
    private Measurement area;
    private Measurement radius;
    
        public Circle(Measurement m1, Measurement m2) {
        setR1(m1);
        calculateArea();
        calculatePerimeter();
    }
    
    public Measurement getPerimeter() {
        return perimeter;
    }

    public Measurement getArea() {
        return area;
    }

    public Measurement getR1() {
        return radius;
    }

    public void setPerimeter(Measurement perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(Measurement area) {
        this.area = area;
    }

    public void setR1(Measurement r1) {
        this.radius = r1;
    }

    



    public Measurement calculatePerimeter() {
        setPerimeter(new Measurement(2.0 * Math.PI * getR1().getValue(), "inches"));
        return getPerimeter();
    }
/**
 * calculates the area of the circle 
 * @return area of the shape
 */
    public Measurement calculateArea() {
        setArea(new Measurement(Math.PI * Math.pow(getR1().getValue(), 2.0), "inches"));
        return getArea();
    
    }
    
   /**
    * This method does calculates the efficiency of the circle object
    * @return the efficiency of the shape
    */
    public double getEfficiency() {

        return getArea().getValue()/getPerimeter().getValue();
    }
}

