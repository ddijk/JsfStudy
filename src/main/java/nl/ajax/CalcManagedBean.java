/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.ajax;

import java.util.Arrays;
import java.util.List;
import javax.enterprise.inject.Model;
import javax.inject.Named;

/**
 *
 * @author Dick
 */
@Named(value = "calcManagedBean")
@Model
public class CalcManagedBean {

    int getal1;
    int getal2;

    int result;

    List<String> colors = Arrays.asList("blue", "red", "yellow");
    String selectedColor;

    /**
     * Creates a new instance of CalcManagedBean
     */
    public CalcManagedBean() {
    }

    public int getGetal1() {
        return getal1;
    }

    public void setGetal1(int getal1) {
        this.getal1 = getal1;
    }

    public int getGetal2() {
        return getal2;
    }

    public void setGetal2(int getal2) {
        this.getal2 = getal2;
    }

    public int getResult() {
        System.out.println("getal1 =" + getal1 + ", getal2=" + getal2);
        return result;
    }

    public void setResult(int result) {
        System.out.println("getal1 =" + getal1 + ", getal2=" + getal2);
        this.result = result;
    }

    public void calculate() {
        System.out.println("getal1 =" + getal1 + ", getal2=" + getal2);
        result = getal1 + getal2;
    }

    public void method1() {
        System.out.println("method1 called, color =" + selectedColor);
    }

    public void method2() {
        System.out.println("method2 called");
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public String getSelectedColor() {
        return selectedColor;
    }

    public void setSelectedColor(String selectedColor) {
        System.out.println("color set to " + selectedColor);
        this.selectedColor = selectedColor;
    }

}
