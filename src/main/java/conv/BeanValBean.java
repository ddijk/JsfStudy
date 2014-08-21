/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conv;

import javax.enterprise.inject.Model;
import javax.faces.event.ActionEvent;
import javax.validation.constraints.Size;

/**
 *
 * @author Dick
 */
@Model
public class BeanValBean {

	/**
	 * Creates a new instance of BeanValBean
	 */
	public BeanValBean() {
	}
	
	@Size(min=2, max=4, message = "{lengte.fout}")
	String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("settting emial to "+ email);
		this.email = email;
	}
	
	public void processClick(ActionEvent e) {
		System.out.println("processClick called");
	}
	
}
