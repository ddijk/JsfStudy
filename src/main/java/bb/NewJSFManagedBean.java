/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bb;

import java.util.Locale;
import java.util.ResourceBundle;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;
import org.apache.log4j.Logger;

/**
 *
 * @author Dick
 */
@Named(value = "newJSFManagedBean")
@RequestScoped
public class NewJSFManagedBean {

	private static Logger LOGGER = Logger.getLogger(NewJSFManagedBean.class);

	String naam;
	String achternaam;
	String bijnaam;
	String city;
	int age;
	boolean smoker;

	public boolean isSmoker() {
		return smoker;
	}

	public void setSmoker(boolean smoker) {
		LOGGER.info("setSmoker : ? " + smoker);
		this.smoker = smoker;
	}

	public String getBijnaam() {
		return bijnaam;
	}

	public void setBijnaam(String bijnaam) {
		this.bijnaam = bijnaam;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAchternaam() {
		return achternaam;
	}

	public void setAchternaam(String achternaam) {
		LOGGER.info("setAchternaam : " + achternaam);
		this.achternaam = achternaam;
	}

	/**
	 * Creates a new instance of NewJSFManagedBean
	 */
	public NewJSFManagedBean() {
		LOGGER.info("constr NewJSFManagedBean");
		final Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
		ResourceBundle rb = ResourceBundle.getBundle("nl.notices", locale);
		String txt = rb.getString("groet");
		LOGGER.info("groet is " + txt + ", locale=" + locale);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(txt));
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
		LOGGER.info("Locale is " + locale);
		this.naam = naam;
	}

	public void knopHandler(ActionEvent e) {
		LOGGER.info("knop handled, lengte= " + naam + ", " + e);
	}

	public String knopHandler2() {
		LOGGER.info("exec knopHandler2, naam=" + naam + ", achternaam=" + achternaam);
		return "/default";

	}

	public void checkFormat(AjaxBehaviorEvent e) {
		LOGGER.info("AjaxBehaviourEvent, " + e);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		LOGGER.info("setAge called: age:" + age);
		this.age = age;
	}

	public void preRenderView() {
		LOGGER.info("preRenderView");
	}

	public void myValueChangeListener(ValueChangeEvent e) {
		LOGGER.info("myValueChangeListener, " + e);
	}

}
