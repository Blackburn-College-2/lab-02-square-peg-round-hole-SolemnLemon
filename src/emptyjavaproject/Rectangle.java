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
public class Rectangle {

    Measurement length;
    Measurement width;

    public Rectangle(Measurement length, Measurement width) {
        this.length = length;
        this.width = width;
//checks if the width is null as a way to know if the rectangle is a square or not 
        if (!(getWidth() == null)) {
            System.out.println(toString());
        }
    }

    public Measurement getLength() {
        return length;
    }

    public Measurement getWidth() {
        return width;
    }

    public void setLength(Measurement length) {
        this.length = length;
    }

    public void setWidth(Measurement width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "This is a rectangle that is " + length.toString() + "es long and " + width.toString() + "es wide";
    }
}
