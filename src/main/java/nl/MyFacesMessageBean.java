/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Dick
 */
@Model
public class MyFacesMessageBean {
    
    
    String name;
    
    @PostConstruct
    void init() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
           
         FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "mijn bericht" , "mijn detail");
        FacesContext.getCurrentInstance().addMessage(null, fm);
    
        this.name = name;
    }
    
    
    
}
