/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.validation;

import java.util.Locale;
import java.util.ResourceBundle;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import org.apache.log4j.Logger;

/**
 *
 * @author dick
 *
 */
@FacesValidator(value = "myvalidator")
public class MyValidator implements Validator {

	private static final Logger LOGGER = Logger.getLogger(MyValidator.class);

	@Override
	public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
		LOGGER.info("o=" + o);
		if (o == null || ((String) o).length() < 3) {
			final Locale locale = fc.getViewRoot().getLocale();
			//throw new ValidatorException(new FacesMessage("{groet}", "{groet}"));
			ResourceBundle bundle = ResourceBundle.getBundle("nl.notices", locale);

			ResourceBundle bundle2 = ResourceBundle.getBundle("nl.berichten", locale);
			final String msg = bundle.getString("groet") + "_" + bundle2.getString("groet");
			final String clientId = uic.getClientId();
			LOGGER.info("locale is " + locale + ", message is " + msg + ", clientId:" + clientId);

			//throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, "detail message blah blah"));
			throw new ValidatorException(new FacesMessage("my summary", "my detail"));
		}
	}

}
