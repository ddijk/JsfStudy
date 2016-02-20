/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conv;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import org.apache.log4j.Logger;

/**
 *
 * @author dick
 */
//FacesConverter(value = "personConverter")
public class PersonConverter implements Converter {

	private static final Logger LOGGER = Logger.getLogger(PersonConverter.class);

	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
		LOGGER.info("getAsObject for " + string);
		Person p = new Person();
		p.setNaam(string);
		return p;
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic, Object o) {
		LOGGER.info("getAsString for " + o);
		return ((Person) o).getNaam();
	}

}
