/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.compositecomp;

import javax.enterprise.inject.Model;

/**
 *
 * @author Dick
 */
@Model
public class SubscriberManagedBean {

    String emailAddress;
    /**
     * Creates a new instance of SubscriberManagedBean
     */
    public SubscriberManagedBean() {
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public String subscribe() {
        System.out.println("Performing subscribing...");
        return "confirm";
    }
    
    
    
}
