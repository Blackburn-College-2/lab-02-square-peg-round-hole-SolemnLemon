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
public class Measurement {

    double value = 0.0;
    String units = "";
    String valueWithUnits;

    public Measurement(double value, String units) {
        this.value = value;
        this.units = units;
        valueWithUnits=toString();
    }

    public String toString() {
 
        String s = String.valueOf(getValue()) + " " + getUnits();
        return s;
    }

    public double getValue() {
        return value;
    }

    public String getUnits() {
        return units;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setUnits(String units) {
        this.units = units;
    }

}
