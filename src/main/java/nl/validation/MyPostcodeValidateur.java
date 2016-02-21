/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.validation;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import org.apache.log4j.Logger;

/**
 *
 * @author dick
 */
public class MyPostcodeValidateur implements Validator {

	private static final Logger LOGGER = Logger.getLogger(MyPostcodeValidateur.class);

	@Override
	public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
		String pc = o.toString();

		LOGGER.info("MyPostcodeValidateur: id van component is " + uic.getId() + ", clienId=" + uic.getClientId());
		if (!pc.equals("2411lN")) {
			throw new ValidatorException(new FacesMessage("jammer"));
		}
	}

}
