/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl;

import java.util.Date;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.inject.Named;
import org.apache.log4j.Logger;

/**
 *
 * @author dick
 */
@Named
@RequestScoped
public class MyBB {

	private static final Logger LOGGER = Logger.getLogger(MyBB.class);

	MyActionListener myActionListener;

	String name;

	@PostConstruct
	public void init() {
		System.out.println("Constr MyBB");
		myActionListener = new MyActionListener();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		LOGGER.info("setting name to " + name);
		this.name = name;
	}

	public MyActionListener getMyActionListener() {
		return myActionListener;
	}

	public void setMyActionListener(MyActionListener myActionListener) {
		this.myActionListener = myActionListener;

		System.out.println("myBB " + myActionListener.getNaam() + " @ " + new Date());
	}

	public void handleAfterPhaseEvent(PhaseEvent pe) {
		LOGGER.info("handle after PhaseEvent " + pe.getPhaseId());
	}

	public void handleBeforePhaseEvent(PhaseEvent pe) {
		String info = FacesContext.getCurrentInstance().getExternalContext().getRequestPathInfo();
		LOGGER.info("pad info : " + info);
		LOGGER.info("handle before PhaseEvent " + pe.getPhaseId());
	}

}
