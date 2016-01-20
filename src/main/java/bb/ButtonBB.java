/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bb;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.inject.Named;
import org.apache.log4j.Logger;

/**
 *
 * @author dick
 */
@SessionScoped
@Named
public class ButtonBB implements Serializable {

	private ActionListener okHandler;
	private ActionListener cancelHandler;
	private static final Logger LOGGER = Logger.getLogger(ButtonBB.class);
	String timestamp = "default waarde";

	@PostConstruct
	void setup() {
		okHandler = new ActionListener() {

			@Override
			public void processAction(ActionEvent ae) throws AbortProcessingException {
				LOGGER.info("processAction called for OK");
				System.out.println("You clicked OK:" + ae);
				timestamp = "ok " + new Date();
			}
		};

		cancelHandler = new ActionListener() {

			@Override
			public void processAction(ActionEvent ae) throws AbortProcessingException {
				LOGGER.info("processAction called for Cancel");
				System.out.println("You clicked cancel:" + ae);
				timestamp = "cancel " + new Date();
			}
		};

		LOGGER.info("Handlers created");
	}

//	public void clickOk(ActionEvent ev) {
//		System.out.println("You clicked OK:" );
//	}
//
//	public void clickCancel(ActionEvent ev) {
//		System.out.println("You clicked Cancel:" );
//	}
	public ActionListener getOkHandler() {
		return okHandler;
	}

	public ActionListener getCancelHandler() {
		return cancelHandler;
	}

	public void setOkHandler(ActionListener okHandler) {
		this.okHandler = okHandler;
	}

	public void setCancelHandler(ActionListener cancelHandler) {
		this.cancelHandler = cancelHandler;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

}
