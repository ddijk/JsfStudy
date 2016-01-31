/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bb;

import java.io.Serializable;
import java.util.Date;
import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
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
	private ValueChangeListener veldHandler;
	private static final Logger LOGGER = Logger.getLogger(ButtonBB.class);
	String timestamp = "default waarde";
	String myComment = "no comment";
	Validator myValidator;

	Converter myConverter;

	public String getMyComment() {
		return myComment;
	}

	public void setMyComment(String myComment) {
		this.myComment = myComment;
	}

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

		veldHandler = new ValueChangeListener() {

			@Override
			public void processValueChange(ValueChangeEvent vce) throws AbortProcessingException {
				LOGGER.info("processValueChange old:" + vce.getOldValue() + ", new:" + vce.getNewValue());
				myComment = "hallo:" + vce.getNewValue();

			}
		};

		myValidator = new Validator() {

			@Override
			public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
				LOGGER.info("Running myValidator....");
			}

		};

		myConverter = new Converter() {

			@Override
			public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
				LOGGER.info("Running myConverter van String naar Object ....");
				return string;
			}

			@Override
			public String getAsString(FacesContext fc, UIComponent uic, Object o) {
				LOGGER.info("Running myConverter van Object naar String...");
				return ("" + o).toUpperCase();
			}

		};

		Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
		LOGGER.info("Handlers created, locale=" + locale);
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

	public ValueChangeListener getVeldHandler() {

		return veldHandler;
	}

	public void setVeldHandler(ValueChangeListener veldHandler) {
		this.veldHandler = veldHandler;
	}

	public Validator getMyValidator() {
		return myValidator;
	}

	public Converter getMyConverter() {
		return myConverter;
	}

}
