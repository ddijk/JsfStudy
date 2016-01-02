/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl;

import java.util.Date;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

/**
 *
 * @author dick
 */
public class MyActionListener implements ActionListener {

    String naam = "jaap";

    @Override
    public void processAction(ActionEvent ae) throws AbortProcessingException {
        System.out.println("processAction " + new Date());
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

}
