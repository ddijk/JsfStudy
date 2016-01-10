/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bb;

import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

/**
 *
 * @author Dick
 */
@Named(value = "newJSFManagedBean")
@RequestScoped
public class NewJSFManagedBean {

	String naam;
	int age;

	/**
	 * Creates a new instance of NewJSFManagedBean
	 */
	public NewJSFManagedBean() {
		System.out.println("constr NewJSFManagedBean");
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void knopHandler(ActionEvent e) {
		System.out.println("knop handled, lengte= " + naam + ", " + e);
	}

	public String knopHandler2() {
		System.out.println("exec knopHandler2, naam=" + naam);
		return "/default";

	}

	public void checkFormat(AjaxBehaviorEvent e) {
		System.out.println("AjaxBehaviourEvent, " + e);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void preRenderView() {
		System.out.println("preRenderView");
	}

	public void myValueChangeListener(ValueChangeEvent e) {
		System.out.println("myValueChangeListener, " + e);
	}

}
