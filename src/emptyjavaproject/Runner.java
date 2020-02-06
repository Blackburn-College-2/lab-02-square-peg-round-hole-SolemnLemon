/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author paul.kline
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Measurement m1 = new Measurement(2.0, "inch");
        Measurement m2 = new Measurement(3.0, "inch");
        Measurement m3 = new Measurement(4.0, "inch");
        Rectangle rec1 = new Rectangle(m1, m2);
        Rectangle rec2 = new Rectangle(m2, m3);

        Rectangle sq1 = new Square(m1, null);
        Rectangle sq2 = new Square(m2, null);
        Ellipse elip1 = new Ellipse(m2, m2);
        Circle circle = new Circle(m2, m2);
        System.out.println("Area: " + elip1.getArea().toString() + " Perimeter: " + elip1.getPerimeter().toString());
        System.out.println("Area: " + circle.getArea().toString() + " Perimeter: " + circle.getPerimeter().toString());
    }

}
