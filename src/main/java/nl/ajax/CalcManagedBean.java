/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.ajax;

import javax.enterprise.context.Dependent;
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
        System.out.println("getal1 ="+ getal1+", getal2="+ getal2);
        return result;
    }

    public void setResult(int result) {
         System.out.println("getal1 ="+ getal1+", getal2="+ getal2);
        this.result = result;
    }
    
    public void calculate() {
         System.out.println("getal1 ="+ getal1+", getal2="+ getal2);
        result = getal1 + getal2;
    }
    
    
    
    
}
