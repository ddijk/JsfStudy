/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl;

import java.util.Date;
import java.util.Map;
import java.util.ResourceBundle;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import org.apache.log4j.Logger;

/**
 *
 * @author dick
 */
@ManagedBean
@RequestScoped
public class MyBB {

	private static final Logger LOGGER = Logger.getLogger(MyBB.class);

	MyActionListener myActionListener;

	String msg;

	String name;

	@ManagedProperty(value = "#{facesContext}")
	private FacesContext facesContext;

	@ManagedProperty(value = "#{initParam}")
	private Map<String, Object> initParamMap;

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

	public String getMsg() {

		LOGGER.info("initParam:" + initParamMap.get("javax.faces.PROJECT_STAGE"));
		String mb = facesContext.getApplication().getMessageBundle();

		facesContext.getExternalContext().getSession(true);
		msg = ResourceBundle.getBundle(mb, facesContext.getViewRoot().getLocale()).getString("groet");
		return msg;
	}

	public FacesContext getFacesContext() {
		return facesContext;
	}

	public void setFacesContext(FacesContext facesContext) {
		this.facesContext = facesContext;
	}

	public Map<String, Object> getInitParamMap() {
		return initParamMap;
	}

	public void setInitParamMap(Map<String, Object> initParamMap) {
		this.initParamMap = initParamMap;
	}

}
