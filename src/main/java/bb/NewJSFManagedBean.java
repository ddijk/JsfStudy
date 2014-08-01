/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bb;

import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;

/**
 *
 * @author Dick
 */
@Named(value = "newJSFManagedBean")
@RequestScoped
public class NewJSFManagedBean {
    
    String lengte;

    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public NewJSFManagedBean() {
        System.out.println("constr NewJSFManagedBean");
    }

    public String getLengte() {
        return lengte;
    }

    public void setLengte(String lengte) {
        this.lengte = lengte;
    }
    
    
    public void knopHandler(ActionEvent e) {
        System.out.println("knop handled, lengte= "+lengte+", "+e);
    }
    
    public void checkFormat(AjaxBehaviorEvent e) {
        System.out.println("AjaxBehaviourEvent, "+e);
    }
    
}
