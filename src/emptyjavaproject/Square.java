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
public class Square extends Rectangle {

    //
    Measurement sideLength;

    public Measurement getSideLength() {
        return sideLength;
    }

    public void setSideLength(Measurement sideLength) {
        this.sideLength = sideLength;
    }

    public Square(Measurement l, Measurement w) {
        super(l, w);
        setSideLength(l);
        System.out.println(toString());
    }

    @Override
    public String toString() {
//overrides method from Rectangle to avoid double/incorrect print

        return "This is a square with " + sideLength.toString() + " sides";
    }
}
