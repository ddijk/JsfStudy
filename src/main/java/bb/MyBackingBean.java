/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bb;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.html.HtmlCommandLink;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;
import org.apache.log4j.Logger;

/**
 *
 * @author dick
 */
@Named
@SessionScoped
public class MyBackingBean implements Serializable {

	HtmlCommandLink commandLink;
	String greeting;
	private static final Logger LOGGER = Logger.getLogger(MyBackingBean.class);

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		LOGGER.info("setGreeting " + greeting + ", " + commandLink.getTitle());
		this.greeting = greeting;
	}

	public HtmlCommandLink getCommandLink() {
		return commandLink;
	}

	public void setCommandLink(HtmlCommandLink commandLink) {
		LOGGER.info("setCommandLink " + commandLink);
		this.commandLink = commandLink;
	}

	public void myHandler(ValueChangeEvent vce) {
		LOGGER.info("old value:  " + vce.getOldValue() + ", new value: " + vce.getNewValue());
	}

}
